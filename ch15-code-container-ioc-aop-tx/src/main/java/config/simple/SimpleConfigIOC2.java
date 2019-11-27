package config.simple;

import com.dao.EmployeeDao;
import com.dao.impl.EmployeeDaoImpl;
import com.service.EmployeeService;
import com.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 南八
 */
@Configuration
public class SimpleConfigIOC2 {

   @Autowired
   private EmployeeDao dao;

    @Autowired
    private EmployeeDaoImpl employeeDao(){
        return new EmployeeDaoImpl();
    }

    @Bean
    public EmployeeService employeeService(){
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        employeeService.setDao(dao);
        return employeeService;
    }
}
