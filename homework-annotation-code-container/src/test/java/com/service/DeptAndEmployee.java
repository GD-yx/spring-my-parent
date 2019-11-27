package com.service;

import java.config.HellpConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeptAndEmployee {
    @Test
    public void txTest(){
        ApplicationContext context = new AnnotationConfigApplicationContext(HellpConfig.class);
        DeptEmployeeServiceImpl employeeService = context.getBean(DeptEmployeeServiceImpl.class);
        employeeService.deleteAndInsert();
    }
}
