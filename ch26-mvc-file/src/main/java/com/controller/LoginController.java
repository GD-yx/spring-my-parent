package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

/**
 * @author 南八
 */
@Controller
public class LoginController {
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @PostMapping("/login")
    public String login(HttpSession session,String username,String password){
        if("admin".equalsIgnoreCase(username)&&"123456".equalsIgnoreCase(password)){
            session.setAttribute("username",username);
            return "index";
        }
        else {
            return "redirect:login";
        }
    }
}
