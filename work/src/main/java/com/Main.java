package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author 南八
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeService service = context.getBean("empService",EmployeeService.class);
        Connection connection = ConnectionHelper.getConnection();
        service.deleteDeptWithEmps(connection,1);

    }
}
