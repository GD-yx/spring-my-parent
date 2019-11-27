package com.controller;

import com.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 南八
 */
@Controller
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DeptService service;
    @RequestMapping("/list")
    public String list(){
        return "/dept/list";
    }
    @RequestMapping("/delete")
    public String delete(int deptid){
        service.deleteById(deptid);
        return "redirect:/dept/list";
    }
}
