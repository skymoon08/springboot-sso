package com.suzhe.sso.common.constant;

public class LoginConstant {

    public static  final String AUTH_TOKEN_KEY = "auth_token";

    public static final Integer AUTH_TOKEN_EXPIRE_TIME = 60 * 60 * 30;


    public static enum Msg {
        username_not_exsit("用户不存在"),
        password_error("密码不正确");

        private String value;

        private Msg(String value){
            this.value = value;
        }

        public String getValue(){
            return value;
        }
    }

}
