package com.suzhe.sso.common.interceptor;



import com.suzhe.sso.common.web.LoginUser;
import com.suzhe.sso.common.web.LoginUserContex;
import com.suzhe.sso.common.annotation.LoginAuth;
import com.suzhe.sso.common.constant.LoginConstant;
import com.suzhe.sso.common.exception.TokenException;
import com.suzhe.sso.common.util.RedisUtil;
import com.suzhe.sso.common.util.RediskeyUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
