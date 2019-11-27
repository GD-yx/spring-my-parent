package inject.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 南八
 */
public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_basic.xml");
        DbConfig dbConfig = context.getBean("dbconfig",DbConfig.class);
        System.out.println("dbConfig = " + dbConfig);
        System.out.println("------------------------------");
        Address address = context.getBean("address",Address.class);
        System.out.println("address = " + address);
        System.out.println("------------------------------");
        UserInfo userInfo = context.getBean("userInfo",UserInfo.class);
        System.out.println("userInfo = " + userInfo);

    }
}
