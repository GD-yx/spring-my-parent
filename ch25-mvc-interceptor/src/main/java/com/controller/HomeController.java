package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 南八
 */

@Controller
public class HomeController {
    @RequestMapping("/index")
    public String index(){
        System.out.println("index in controller-------");
        return "index";
    }

    @RequestMapping("/index2")
    public String index2(){
        System.out.println("index2 in controller-------");
        return "index";
    }
}
