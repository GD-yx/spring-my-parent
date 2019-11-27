package aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 南八
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext_aware.xml");
        SomeBean bean = context.getBean("someBean",SomeBean.class);
        ApplicationContext context1 = bean.getContext();
        System.out.println(context==context1);
    }
}
