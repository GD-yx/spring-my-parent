package com.controller.passdatatoview;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

/**
 *
 * 请求之间传递数据
 * @author 南八
 */
@Controller
@RequestMapping("/redirect")
public class RedirectPassController {

    /**
     * 第一种，利用httpSession利用session(HttpSession)
     * 和application(ServletContext)
     * @param httpSession
     * @return
     */
    @RequestMapping("/demo1")
    public String demo1(HttpSession httpSession){
        httpSession.setAttribute("f","利用session(HttpSession)和application(ServletContext)");
        return "redirect:demo2";
    }
    @RequestMapping("/demo2")
    public String demo2(){
        return "view";
    }

    /**
     * 利用拼接url的方式传递数据,
     * url致命缺点:
     * 1.长度是有限制,2.拼接字符繁琐
     */
    @RequestMapping("/demo3")
    public String demo3(){
        return "redirect:demo4?f=ssdf";
    }

    @RequestMapping("/demo4")
    public String demo4(String f, Model model){
        model.addAttribute("f",f);
        return "view";
    }

    @GetMapping("/demo5")
    public String demo5(RedirectAttributes redirectAttributes){
        redirectAttributes.addAttribute("f1","demo5 f1");
        redirectAttributes.addFlashAttribute("f","demo5 flash");
        return "redirect:demo6";
    }

    @GetMapping("/demo6")
    public String demo6(String  f1, Model model){
        return "view";
    }


    @GetMapping("/demo7")
    public String demo33(){
        return "view";
    }
}
