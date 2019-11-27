package config.simple;

import com.dao.EmployeeDao;
import com.dao.impl.EmployeeDaoImpl;
import com.service.EmployeeService;
import com.service.impl.EmployeeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 南八
 */
@Configuration
public class SimpleConfigIOC {
    @Bean
    public EmployeeDaoImpl employeeDao(){
        return new EmployeeDaoImpl();
    }

    @Bean
    public EmployeeService employeeService(EmployeeDao dao){
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        employeeService.setDao(dao);
        return employeeService;
    }
}
