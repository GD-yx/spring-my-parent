package com;

import com.service.emp.EmployeeService;
import com.service.emp.impl.EmployeeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 南八
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeServiceImpl service = context.getBean("serviceImpl",EmployeeServiceImpl.class);
        service.getAll();
        service.deleteById();
        service.getById();
        service.xxx();
    }

}
