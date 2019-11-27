package test;

import entity.Dept;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.DeptService;

import java.util.List;

/**
 * @author 南八
 */
public class Main {
   /* public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptService service = context.getBean("deptService", DeptService.class);
        List<Dept> depts = service.getAll(2,4);
        for (Dept dept : depts) {
            System.out.println("dept = " + dept);
        }
    }*/
}
