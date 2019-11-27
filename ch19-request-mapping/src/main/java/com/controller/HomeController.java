package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 南八
 */
@Controller
public class HomeController {
    @RequestMapping("/index")
    public String  index(){
        return "index";
    }

    /**
     * requestMapping它是支持ant地址格式
     * @return
     */
    @RequestMapping("/**/*index")
    public String  index2(){
        return "index";
    }

    /**
     * 默认路径index
     * @return
     */
   /* @RequestMapping("*")
    public String  index3(){
        return "index";
    }
*/
    /**
     * 两个路径都是index
     * @return
     */
    @RequestMapping(value = {"/index","index3"})
    public String  index4(){
        return "index";
    }
}
