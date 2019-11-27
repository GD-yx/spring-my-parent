package com;

import com.service.EmployeeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {
    @Test
    public void testAnnoHelloWord(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeService service  = context.getBean(EmployeeService.class);
        System.out.println(service);
    }

    @Test
    public void testAnno_ioc(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeService service = context.getBean(EmployeeService.class);
        service.update();
    }
}
