package com.service;


import java.config.HellpConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = HellpConfig.class)
public class DeptAndEmployeeTest {
    @Autowired
    private ApplicationContext context;
    @Test
    public void testTx()
    {
        DeptEmployeeServiceImpl deptEmployeeService = context.getBean(DeptEmployeeServiceImpl.class);
        deptEmployeeService.deleteAndInsert();
    }
}
