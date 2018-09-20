#  springboot-sso

#### 项目介绍
![1537427622428](C:\Users\ADMINI~1\AppData\Local\Temp\1537427622428.png)



该项目用账户服务（需要登录授权），产品服务（不需要登录授权），演示了基于redis的单点登录的实现。

登录拦截器：

```java
/**
 * 登录(Token)验证
 */
@Component
public class AuthorizationInterceptor extends HandlerInterceptorAdapter {
    @Autowired
    RedisUtil redisUtil;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        //从header中获取token
        String authToken= request.getHeader(LoginConstant.AUTH_TOKEN_KEY);
        LoginUser loginUser = null;
        LoginUserContex.remove();//将原有ThreadLocal里的数据清除
       //如果条件满足 取出redis里的用户 和 当前线程绑定
        if(StringUtils.isNotBlank(authToken)){
            loginUser = redisUtil.get(RediskeyUtil.getAuthTokenKey(authToken),LoginUser.class);
             if (loginUser != null){
                 LoginUserContex.setLoginUser(loginUser);
             }
        }
        LoginAuth annotation;
        if(handler instanceof HandlerMethod) {
            annotation = ((HandlerMethod) handler).getMethodAnnotation(LoginAuth.class);
        }else{
            return true;
        }
        if(annotation == null){//如果请求的链接不包含 授权登录的注解 放行
            return true;
        }
        //如果token为空 抛出授权失败异常
        if (StringUtils.isBlank(authToken)){
            throw new TokenException();
        }
        //如果redis里取不到用户 抛出授权失败异常
        if (loginUser == null){
            throw new TokenException();
        }
            redisUtil.expire(RediskeyUtil.getAuthTokenKey(authToken),LoginConstant.AUTH_TOKEN_EXPIRE_TIME);
        return true;
    }
}
```

用户登录成功后，就会把token保存到本地，每一次请求，都会在head里带上带上该token。

```
headers:{
    auth_token:localStorage.getItem("auth_token"),
}
```

授权拦截器里就会取出head里的token，如果存在该token并且在redis里有对应的用户，就会和当前线程绑定。然后判断该请求是否有LoginAuth注解，如果存在，就说明该请求是需要登录才可以访问的请求，进行验证。

验证失败会抛出TokenException异常，该异常会在统一异常处理类ExceptionAdvice里进行处理：

```java
    /**
     * TokenException 令牌验证失败
     * @param e
     * @return
     */
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(TokenException.class)
    public R handleTokenExceptio(TokenException e) {
        return R.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),"令牌验证失败");
    }
```

客户端就会收到状态码为401的返回结果，客户端会在请求的统一异常处理里判断：如果是授权失败的消息，就会跳到登录页面。common.js 里封装的ajax请求的catch代码块。

```js
		.catch(function (response) {
            if (response.body.status == 100010){//100010自定义的授权失败code
                window.location.href = common.baseUrl + "/statics/login.html";
            }else{
                alert(response.body.msg);
            }
        })
```



登录验证成功后，就会放行，比如账户中心的服务：账户服务通过LoginUserContex类取出登录的用户，

调用账户服务，返回数据。

```jav
    @LoginAuth
    @RequestMapping(value = "getAccountInfo", method = RequestMethod.GET)
    public R<AccountVo> getAccountInfo() {
        LoginUser loginUser = LoginUserContex.getLoginUser();
        AccountVo accountVo = iAccountService.getAccountVo(loginUser.getId());
        return R.createBySuccess(accountVo);
    }
```





用户登录：

用户输入用户名和密码，验证通过后，会创建token。并已token为key，value 为loginUser的json格式存储到redis中。

```java
   //创建授权token
        LoginUser loginUser = PojoToVoConvert.MAPPER.pojoToLoginUser(user);
        String authToken = UUID.randomUUID().toString();
        redisUtil.set(RediskeyUtil.getAuthTokenKey(authToken),loginUser, LoginConstant.AUTH_TOKEN_EXPIRE_TIME);
```





