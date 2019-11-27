package lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 南八
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext_lifecycle.xml");

        //UserInfoDaoLifeCycle dao = context.getBean("daoLife",UserInfoDaoLifeCycle.class);
        //UserInfoDaoLifeCycle dao2 = context.getBean("daoLife",UserInfoDaoLifeCycle.class);
        UserInfoDaoLifeCycle2 dao3 = context.getBean("daoLife2",UserInfoDaoLifeCycle2.class);


        ((ConfigurableApplicationContext)context).close();
    }
}
