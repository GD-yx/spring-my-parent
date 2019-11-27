package inject.namespace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 南八
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_namespace.xml");
       /* MySqlFactory factory = context.getBean("factory",MySqlFactory.class);
        System.out.println(factory);*/
       MyDataSource dataSource = context.getBean("dataSource",MyDataSource.class);
        System.out.println(dataSource);
    }

}
