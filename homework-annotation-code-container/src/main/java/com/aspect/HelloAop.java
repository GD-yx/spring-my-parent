package com.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author 南八
 */
@Component
@Aspect
public class HelloAop {
    @Pointcut("execution(* com.service..*.*(..))")
    public void myPoint(){

    }
    @Before("myPoint()")
    public void before(){
        System.out.println("before------");
    }
}
