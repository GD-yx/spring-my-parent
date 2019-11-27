package com.service.impl;

import com.dao.EmployeeDao;
import config.simple.SimpleConfig;
import config.simple.SimpleConfigIOC;
import config.simple.SimpleConfigIOC2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SimpleConfigIOC2Test {
    @Test
    public void testSimpleConfig(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SimpleConfigIOC2.class);
        EmployeeServiceImpl employeeService = context.getBean(EmployeeServiceImpl.class);
        employeeService.update();
    }

}
