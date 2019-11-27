package com.service.impl;

import com.entity.EmployeeEntity;
import com.service.DeptAndEmployeeService;
import config.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class DeptAndEmployeeImplTest {
    @Autowired
    private DeptAndEmployeeService  deptAndEmployeeService;

    @Test
    public void getAll(){
        List<EmployeeEntity> result = deptAndEmployeeService.getAll(2,3);
        for (EmployeeEntity employeeEntity : result) {
            System.out.println("employeeEntity = " + employeeEntity);
        }
    }

    @Test
    public void txDemo(){
        deptAndEmployeeService.txDemo();
    }
}
