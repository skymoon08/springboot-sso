package com.suzhe.sso.common.util;

public class RediskeyUtil {

    /**
     * 获取登录录授权token 的 key
     * @param key
     * @return
     */
    public static String getAuthTokenKey(String key){
        return "login:token:" + key;
    }

}
