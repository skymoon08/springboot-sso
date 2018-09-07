package com.suzhe.sso.common;


import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.io.Serializable;

/**
 * 基础对象，实现Serializable接口，并提供默认的toString方法。
 */
public class BaseObject implements Serializable {

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

}