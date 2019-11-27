package com.controller.view;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;

/**
 * 显示视图
 * @author 南八
 */
@Controller
@RequestMapping("/view")
public class ViewDemoController {

    /**
     *  下面是三种转发到视图的方法
     * 1. 直接返回字符串,代表视图名
     * 2. 直接返回字符串,加前缀forward,比如:"forward:view"
     * 3. 返回ModelAndView,直接设置视图名即可
     *
     */


    /**
     * 最简单的方法，直接转发
     * @return
     */
    @RequestMapping("/demo1")
    public String demo1(){
        return "view";
    }


    /**
     * 这个转发的方法，不能直接返回view
     * forward会使视图解析器失效，
     * 在返回的string类型中，有前缀（forward或者redirect）
     *
     * 所以必须写全：/WEB-INF/views/view.jsp
     * 而不是view
     * @param request
     * @return
     */
    @RequestMapping("/demo2")
    public String demo2(HttpServletRequest request){
        request.setAttribute("f","sadf");
        /*这种是错误的  return "forward:view";*/
        return "forward:/WEB-INF/views/view.jsp";
    }


    /**
     * 利用ModelAndView，设置视图名
     * @return
     */
    @RequestMapping("/demo3")
    public ModelAndView demo3(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("view");
        /*下面这两种：
        第一种错误，第二种可以
        mav.setViewName("forward:views")
        mav.setViewName("forward:/WEB-INF/views/view.jsp");*/
        return mav;
    }


    /**
     * 下面是重定向的两种种方法（指多个请求方法之间的跳转）
     * 重定向和转发的区别在于url是变化的
     * 第一种通过HttpServletRequest，返回redirect:重定向的地址
     * 第二种通过new一个RedirectView对象（给url设值为重定向的地址）
     * 再返回RedirectView对象。
     * @param request
     * @return
     */

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
