package com.suzhe.sso.common;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;


@JsonSerialize(include =  JsonSerialize.Inclusion.NON_NULL)
//保证序列化json的时候,如果是null的对象,key也会消失
public class R<T> implements Serializable {

    private int status;
    private String msg;
    private T data;

    private R(int status){
        this.status = status;
    }
    private R(int status,T data){
        this.status = status;
        this.data = data;
    }

    private R(int status,String msg,T data){
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    private R(int status,String msg){
        this.status = status;
        this.msg = msg;
    }

    @JsonIgnore
    //使之不在json序列化结果当中
    public boolean isSuccess(){
        return this.status == ResponseCode.SUCCESS.getCode();
    }

    public int getStatus(){
        return status;
    }
    public T getData(){
        return data;
    }
    public String getMsg(){
        return msg;
    }


    public static <T> R<T> createBySuccess(){
        return new R<T>(ResponseCode.SUCCESS.getCode());
    }

    public static <T> R<T> createBySuccessMessage(String msg){
        return new R<T>(ResponseCode.SUCCESS.getCode(),msg);
    }

    public static <T> R<T> createBySuccess(T data){
        return new R<T>(ResponseCode.SUCCESS.getCode(),data);
    }

    public static <T> R<T> createBySuccess(String msg,T data){
        return new R<T>(ResponseCode.SUCCESS.getCode(),msg,data);
    }


    public static <T> R<T> createByError(){
        return new R<T>(ResponseCode.ERROR.getCode(),ResponseCode.ERROR.getDesc());
    }


    public static <T> R<T> createByErrorMessage(String errorMessage){
        return new R<T>(ResponseCode.ERROR.getCode(),errorMessage);
    }

    public static <T> R<T> createByErrorCodeMessage(int errorCode,String errorMessage){
        return new R<T>(errorCode,errorMessage);
    }


}
