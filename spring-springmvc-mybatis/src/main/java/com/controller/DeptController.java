package com.controller;


import com.service.DeptService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeptController {
    /**
     * 方法如果不是返回类型的话，
     * @RequestMapping("")里的路径必须和jsp文件的名字一样
     * 如果有返回类型的话，返回的内容和jsp文件一样
     * @param id
     * @param deptname
     * @return
     */
    @RequestMapping("/insert")
    public String DeptInsert(Integer id,String deptname) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptService service = context.getBean("deptService",DeptService.class);
      service.insert(46,"dfd");
        return "index";
    }
}
