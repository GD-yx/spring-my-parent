package test;

import entity.Dept;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.DeptService;

import java.util.List;

public class Main {
   /* public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptService service = context.getBean("deptService",DeptService.class);
        List<Dept> deptList = service.getAll();
        for (Dept dept : deptList) {
            System.out.println(dept);
        }
    }*/
}
