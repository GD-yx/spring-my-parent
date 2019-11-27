package com.factorybean;

import com.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 南八
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_factoryBean.xml");
        EmployeeService service = context.getBean("empFactory",EmployeeService.class);
        int result = service.add(5,6);
        System.out.println("result = " + result);
    }
}
