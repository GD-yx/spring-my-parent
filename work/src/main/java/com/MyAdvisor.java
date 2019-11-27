package com;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.sql.Connection;

/**
 * @author 南八
 */
public class MyAdvisor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Connection connection = (Connection) methodInvocation.getArguments()[0];
        connection.setAutoCommit(false);
        Object result = null;
        try{
            result = methodInvocation.proceed();
        }catch (Throwable e) {
            connection.rollback();
        }
        connection.commit();
        connection.setAutoCommit(true);
        return result;
    }
}
