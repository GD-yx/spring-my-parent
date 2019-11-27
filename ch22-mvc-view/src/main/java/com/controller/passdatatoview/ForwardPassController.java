package com.controller.passdatatoview;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * 传递数据到视图
 * @author 南八
 */
@Controller
@RequestMapping("/forward")
public class ForwardPassController {
    @RequestMapping("/demo1")
    public String demo1(HttpServletRequest request){
        request.setAttribute("f","利用request传递");
        return "view";
    }

    @RequestMapping("/demo2")
    public ModelAndView demo2(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("f","利用ModelAndView传递");
        modelAndView.setViewName("view");
        return modelAndView;
    }

    @RequestMapping("/demo3")
    public String demo3(Model model){
        model.addAttribute("f","利用Model传递");
        return "view";
    }

    @RequestMapping("/demo4")
    public String demo4(Model model, ModelMap modelMap, Map<String ,Object> map){
        model.addAttribute("f","");
        return "view";
    }
}
