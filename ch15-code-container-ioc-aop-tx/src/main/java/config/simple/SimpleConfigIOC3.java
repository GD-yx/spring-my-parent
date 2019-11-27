package config.simple;

import com.dao.impl.EmployeeDaoImpl;
import com.service.EmployeeService;
import com.service.impl.EmployeeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 南八
 */
@Configuration
public class SimpleConfigIOC3 {
    @Bean
   public EmployeeDaoImpl employeeDao(){
        return new EmployeeDaoImpl();
    }

    @Bean
    public EmployeeService employeeService(){
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        employeeService.setDao(employeeDao());
        return employeeService;
    }
}
