package com;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author 南八
 */
public class LogImpl {
    public void before() {

        System.out.println("before*********");
    }

    public void before2() {

        System.out.println("before222*********");
    }
    public void after(){
        System.out.println("after*********");
    }
    public void afterReturn(){
        System.out.println("after return*********");
    }

    public void throwAdvice(RuntimeException re){
        System.out.println("-----debug: re = " + re);
        System.out.println("throwAdvice*********");
    }


    public Object aroundAdvice(ProceedingJoinPoint joinpoint){
        Object result = null;
        System.out.println("aroundAdvice before****");
        try {
            //这个代码是让目标方法执行,不调用会导致目标方法不执行
            result = joinpoint.proceed();
            // System.out.println("aroundAdvice return********");
        } catch (Throwable throwable) {
            System.out.println("aroundAdvice throw *********");
        }

        System.out.println("aroundAdvice after*********");
        return result;
    }

    public Object aroundAdvice2(ProceedingJoinPoint joinpoint){
        Object result = null;
        System.out.println("aroundAdvice before22****");
        try {
            //这个代码是让目标方法执行,不调用会导致目标方法不执行
            result = joinpoint.proceed();
            System.out.println("aroundAdvice return222********");
        } catch (Throwable throwable) {
            System.out.println("aroundAdvice throw222 *********");
        }

        System.out.println("aroundAdvice after222*********");
        return result;
    }
}
