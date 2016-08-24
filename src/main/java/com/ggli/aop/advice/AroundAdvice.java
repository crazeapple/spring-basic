package com.ggli.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by ggli on 2016/8/23.
 */
public class AroundAdvice implements MethodInterceptor {

    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        try {
            System.out.println("[Around method] Before: " + methodInvocation.getMethod().getName());
            Object obj = methodInvocation.proceed();
            System.out.println("[Around method] After: " + methodInvocation.getMethod().getName());
            return obj;

        } catch (IllegalArgumentException e) {
            System.out.println("[Around method] Exception: " + methodInvocation.getMethod().getName());
            throw e;
        }
    }
}
