package com.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author 南八
 */
@Component //表明被spring管理起来
@Aspect //表明此类是切面类

public class LogAspect {

    @Pointcut("execution(* com.service..*.*(..))")
    public void myPointCut(){

    }

    @Before("myPointcut()")
    public void before(){
        System.out.println("before----------");
    }


    public void after(){
        System.out.println("after--------");
    }


    public void afterReturning(int ret){
        System.out.println("after return... " + ret);
    }


    public void afterThrowing(RuntimeException re){
        System.out.println("after throw---t " + re);
    }


    public Object around(ProceedingJoinPoint joinPoint){
        Object result = null;
        System.out.println("before in around---");
        try {
            result = joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return result;
    }
}
