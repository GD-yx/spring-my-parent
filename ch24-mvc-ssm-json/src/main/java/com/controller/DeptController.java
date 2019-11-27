package com.controller;

import com.entity.Dept;
import com.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 南八
 */
@Controller
public class DeptController {
    @Autowired()
    @Qualifier("ss")
    private DeptService service;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @PostMapping(value = "/index")
    @ResponseBody
    public List<Dept> getAll(){
        List<Dept> depts=service.getAll();;
        return depts;
    }

    @RequestMapping("/insert")
    @ResponseBody
    public void insert(Dept dept){
        service.insert(dept);
    }
}
