package com.controller;

import com.entity.Emp;
import com.formatter.EmpFormatter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

/**
 * @author 南八
 */
@Controller
@RequestMapping("/formatter")
public class FormatterController {
    @InitBinder
    public void xxx(WebDataBinder dataBinder){
        dataBinder.addCustomFormatter(new DateFormatter());
        dataBinder.addCustomFormatter(new EmpFormatter());
    }
    @RequestMapping("/date")
    public String receiveDate(@DateTimeFormat(pattern = "yyyy-MM-dd")Date date){
        System.out.println("date = " + date);
        return "index";
    }

    @GetMapping("/emp")
    public String receiveEmp(@RequestParam("xxx") Emp emp){
        System.out.println("-----debug: emp = " + emp);
        return "index";
    }

}
