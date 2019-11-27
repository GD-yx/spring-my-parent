package controller;

import com.github.pagehelper.PageInfo;
import entity.Dept;
import entity.Pagination;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import service.DeptService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author 南八
 */
@WebServlet("/index")
public class DeptServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(req.getServletContext());
        DeptService  service = context.getBean("deptService",DeptService.class);
        int pageNum = req.getParameter("page")==null?1:Integer.parseInt(req.getParameter("page"));
        List<Dept> deptList = service.getAll(pageNum,2);
        int count = service.getUserCount();
        Pagination pagination = new Pagination(1,pageNum,count);
      /*  PageInfo<Dept> pageInfo = new PageInfo<>(deptList,3);
        req.setAttribute("pageInfo",pageInfo);*/
        req.setAttribute("pagination",pagination);
        req.setAttribute("deptlist",deptList);
        req.getRequestDispatcher("index.jsp").forward(req,resp);

    }
}
