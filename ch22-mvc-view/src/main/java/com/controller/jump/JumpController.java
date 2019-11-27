package com.controller.jump;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * 多个请求方法之家的跳转和转发
 * 控制器方法间的跳转
 * @author 南八
 */
@Controller
@RequestMapping("/jump")
public class JumpController {

   // 转发(forward):指的是多个请求方法之间的转发

    @RequestMapping("/demo1")
    public String demo1(){
        return "forward:demo2";
    }

    @RequestMapping("/demo2")
    public String demo2(){
        return "view";
    }



    //重定向(redirect):指的是多个请求方法之间的跳转

    @RequestMapping("/demo4")
    public String demo4(HttpServletRequest request){
        request.setAttribute("f","demo4的重定向");
        return "redirect:demo6";
    }

    @RequestMapping("/demo5")
    public RedirectView demo5(){
        RedirectView redirectView = new RedirectView("demo6");
        return redirectView;
    }

    @RequestMapping("/demo6")
    public String demo6(){
        return "view";
    }

}
