package com.controller;

import com.entity.Student;
import com.github.pagehelper.PageInfo;
import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

/**
 * @author 南八
 */
@Controller
@RequestMapping("/stu")
public class StudentController {
    @Autowired
    private StudentService service;
    @RequestMapping("/list")
    public String list(@RequestParam(value = "pageNum",
                                            required = false,defaultValue = "1") int pageNum,
                       @RequestParam(value = "pageSize",
                                            required = false,defaultValue = "2")int pageSize, Model model){
        List<Student> students = service.getAll(pageNum,pageSize);
        PageInfo pageInfo = new PageInfo(students);
        model.addAttribute("list",pageInfo);
        return "student/list";
    }

    @GetMapping("/add")
    public String add(){
        return "/student/add";
    }
    @PostMapping("/insert")
    public String insert(@Valid Student student, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "/student/add";
        }
        service.insert(student);
        System.out.println("dfdf");
        return "redirect:/stu/list";
    }
}
