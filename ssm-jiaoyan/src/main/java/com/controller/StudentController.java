package com.controller;

import com.entity.Student;
import com.service.StudentService;
import com.service.impl.StudentServiceImpl;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

/**
 * @author 南八
 */
@Controller
public class StudentController {
    @Autowired
    private StudentServiceImpl service;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/insert")
    public ModelAndView index(@Valid Student student, BindingResult bindingResult){
        ModelAndView view = new ModelAndView();
        if(bindingResult.hasErrors()){
            List<FieldError> errors = bindingResult.getFieldErrors();
            /*for (FieldError error : errors) {
                view.addObject("aa",error.getDefaultMessage());
            }*/
            view.addObject("aa",errors);
                view.setViewName("error");
        }else {
            service.insert(student);
            view.setViewName("index");
        }
        System.out.println("student = " + student);
        return view;
    }
}
