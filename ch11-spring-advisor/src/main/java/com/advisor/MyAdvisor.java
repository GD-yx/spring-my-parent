package com.advisor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * @author 南八
 */
public class MyAdvisor implements MethodBeforeAdvice, AfterReturningAdvice, MethodInterceptor, ThrowsAdvice {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("around before");
        Object result = invocation.proceed();
        System.out.println("around after");
        return result;
    }

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("returnValue = " + returnValue);
    }

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("before------------");
    }


    public void afterThrowing(Method method,Object[] args,Object target,RuntimeException re) throws Throwable {
        System.out.println("re = " + re.getMessage());
    }
}
