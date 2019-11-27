package inject.parentchild;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 南八
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_parentchild.xml");
       /* MyParent parent = context.getBean("myParent",MyParent.class);
        System.out.println("parent = " + parent);*/
        ChildOne one = context.getBean("childOne",ChildOne.class);
        System.out.println("one = " + one);
    }
}
