package inject.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 南八
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_factory.xml");
        SqlSessionFactory factory = context.getBean("sqlSessionFactory",SqlSessionFactory.class);
        System.out.println("factory = " + factory);
        /*SqlSessionFactoryCreator s = context.getBean("sqlSessionFactoryCreator",SqlSessionFactoryCreator.class);
        System.out.println("s = " + s);*/
    }
}
