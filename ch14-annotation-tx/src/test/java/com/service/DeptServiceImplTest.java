package com.service;


import com.service.impl.DeptServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class DeptServiceImplTest {

    @Autowired
    private ApplicationContext context;
    @Autowired
    private DeptServiceImpl deptService;

    @Test
    public void testTx(){
        deptService.txDemo();
    }
}
