import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.rmi.runtime.Log;

/**
 * @author 南八
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeServiceImpl service = context.getBean("employeeService", EmployeeServiceImpl.class);
        System.out.println("-----debug: service.getClass() = " + service.getClass());
        service.insert();
        System.out.println("--------------------------");
        service.update();

    }
}
