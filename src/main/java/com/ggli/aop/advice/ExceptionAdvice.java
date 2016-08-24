package com.ggli.aop.advice;

import org.springframework.aop.ThrowsAdvice;

/**
 * Created by ggli on 2016/8/23.
 */
public class ExceptionAdvice implements ThrowsAdvice {

    public void afterThrowing(IllegalArgumentException e) throws Throwable {
        System.out.println("[ExceptionAdvice] sends the regards: " + e.toString());
    }
}
