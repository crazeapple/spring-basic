package com.ggli.aop.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by ggli on 2016/8/23.
 */
public class BeforeAdvice implements MethodBeforeAdvice {

    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("[Before method] " + o.getClass().getName() + "." + method.getName() + "()");
    }
}
