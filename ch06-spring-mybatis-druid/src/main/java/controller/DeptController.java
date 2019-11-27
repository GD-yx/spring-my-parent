package controller;

import entity.Dept;
import service.DeptService;
import spring.ApplicationContextHolder;

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
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DeptService service = ApplicationContextHolder.getBean("deptService", DeptService.class);
        Dept dept = service.getById();
        req.setAttribute("dept",dept);
        req.getRequestDispatcher("index.jsp").forward(req,resp);

    }
}
