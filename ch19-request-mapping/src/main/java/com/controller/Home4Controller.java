package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/dept")
public class Home4Controller {
    @GetMapping("/get")
    public String index(){
        return "index";
    }

    @PostMapping("/post")
    public String index2(){
        return "index";
    }

    @DeleteMapping("/delete")
    public String index3(){
        return "index";
    }

    @PutMapping("/put")
    public String index4(){
        return "index";
    }


    @PatchMapping("/patch")
    public String index5(){
        return "index";
    }
}
