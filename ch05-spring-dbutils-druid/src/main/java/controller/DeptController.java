package controller;

import entity.Dept;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.DeptService;
import spring.ApplicationContextUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 南八
 */
@WebServlet("/index")
public class DeptController extends HttpServlet {
   /* @Override

    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptService service = context.getBean("deptService",DeptService.class);
        Dept dept = service.getById();
        req.setAttribute("dept",dept);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }*/

    //上面这种写法，如果servlet写多了，就会创建多个spring容器。
    //那么会导致spring管理的bean不具备单列的情况。
    //有多少个spring容器，单列的bean就会有多少个，spring容器只需要一个。
    //下面这个写法解决了以上问题，用到了ServletContextListener上下文监听器。

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       ApplicationContext context = ApplicationContextUtil.getApplicationContext(req);
        DeptService service = context.getBean("deptService",DeptService.class);
        Dept dept = service.getById();
        req.setAttribute("dept",dept);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
