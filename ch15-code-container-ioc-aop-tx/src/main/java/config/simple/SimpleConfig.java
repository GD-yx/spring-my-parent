package config.simple;

import com.dao.impl.EmployeeDaoImpl;
import com.service.impl.EmployeeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 南八
 */
@Configuration
public class SimpleConfig {
    @Bean
    public EmployeeDaoImpl employeeDao(){
        return new EmployeeDaoImpl();
    }
    @Bean
    public EmployeeServiceImpl employeeService(){
        return new EmployeeServiceImpl();
    }
}
