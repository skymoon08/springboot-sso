package com.suzhe.sso.common.web;

public class LoginUserContex {


    private static ThreadLocal<LoginUser> userLocal = new ThreadLocal<LoginUser>();


    //获取登录用户
    public static LoginUser getLoginUser() {

        return userLocal.get();
    }

    /**
     * 设置参数
     */
    public static void setLoginUser(LoginUser loginUser) {
        userLocal.set(loginUser);

    }

    public static void remove(){
        userLocal.remove();
    }

}
