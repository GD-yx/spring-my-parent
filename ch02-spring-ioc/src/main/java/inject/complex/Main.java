package inject.complex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 南八
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_complex.xml");
         UserDao dao = context.getBean("userDao",UserDaoImpl.class);
        dao.update();
        UserServiceImpl service = context.getBean("userService",UserServiceImpl.class);
        service.update();
}

}
