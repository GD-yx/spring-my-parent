package com.controller.view;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 南八
 */
public class DisViewController {

    //显示视图

    @RequestMapping("/demo1")
    public String demo1(){
        return "view";
    }

    @RequestMapping("/demo3")
    public ModelAndView demo3(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("view");
        return mav;
    }
}
