package com;

import com.service.impl.CalcServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {

    @Test
    public void testAnnoAop(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CalcServiceImpl calcService = context.getBean(CalcServiceImpl.class);
        int result = calcService.add(5,6);
        System.out.println("result = " + result);
    }

}
