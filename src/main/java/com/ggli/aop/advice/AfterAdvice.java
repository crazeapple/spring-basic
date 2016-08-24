package com.ggli.aop.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by ggli on 2016/8/23.
 */
public class AfterAdvice implements AfterReturningAdvice {

    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("[After method] " + o1.getClass().getName() + "." + method.getName() + "()");
    }
}
