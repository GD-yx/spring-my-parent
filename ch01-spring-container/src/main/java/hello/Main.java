package hello;

import hello.UserInfoDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 南八
 */
public class Main {
    public static void main(String[] args) {
        //ApplicationContext代表着spring容器，是个接口
        //spring的容器指的是applicationContext这种类型的接口体系
        //容器的启动：指的是



        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserInfoDao dao = (UserInfoDao) context.getBean("first");
        UserInfoDao dao2 =  context.getBean("first",UserInfoDao.class);
        System.out.println("dao = " + dao);
        System.out.println("dao2 = " + dao2);
    }

}
