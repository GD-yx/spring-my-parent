package config;

import com.dao.EmployeeDao;
import com.dao.impl.EmployeeDaoImpl;
import com.service.EmployeeService;
import com.service.impl.EmployeeServiceImpl;
import com.service.impl.EmployeeServiceImpl2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 南八
 */
@Configuration
public class HelloConfig {
    @Bean
    public EmployeeDaoImpl employeeDaoImpl(){
        return new EmployeeDaoImpl();
    }

    @Bean
    public EmployeeServiceImpl employeeService(EmployeeDao dao){
        EmployeeServiceImpl service = new EmployeeServiceImpl();
        service.setDao(dao);
        return service;
    }

    @Bean
    public EmployeeServiceImpl2 employeeServiceImpl2(){
        EmployeeServiceImpl2 employeeServiceImpl2 = new EmployeeServiceImpl2();
        employeeServiceImpl2.setDao(employeeDaoImpl());
        return employeeServiceImpl2;
    }

   @Configuration
    static class MyInnerConfig{

   }

}
