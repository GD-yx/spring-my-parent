package com.controller;

import com.entity.Emp;
import com.entity.EmpVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 南八
 */
@Controller
public class HomeController {
    @GetMapping("/index")
    public String index(){
            return "index";
    }

    /**
     * 包装类型
     * wrapper?abc=das&pageNo=2的形式来访问
     * @param abc
     * @param pageNo
     * @return
     */
    @GetMapping("/wrapper")
    public String index(String abc,Integer pageNo){
        System.out.println("------"+abc);
        System.out.println("------"+pageNo);
        return "index";
    }

    /**
     * 普通类型 /simple?pageNo=8
     * @param pageNo
     * @return
     */
    @GetMapping("/simple")
    public String index(int pageNo){
        System.out.println("------"+pageNo);
        return "index";
    }

    /**
     * 给一个别名给参数，访问的时候如下
     *  /simple2?page=3
     *  就不用访问pageNo了自己访问page
     *  如果没赋值就直接默认为1
     * @param pageNo
     * @return
     */
    @GetMapping("/simple2")
    public String index2(@RequestParam(value = "page",required = false,defaultValue = "1")int pageNo){
        System.out.println("pageNo = " + pageNo);
        return "index";
    }

    @GetMapping("/simple/page/{pageNo}")
    public String index3(@PathVariable("pageNo") int pageNo){
        System.out.println("-----debug: pageNo = " + pageNo);
        return "index";
    }


    /**
     * 给字段赋值得到一个对象
     * /complex?id=8&username=sdf
     * @param emp
     * @return
     */
    @GetMapping("/complex")
    public String index(Emp emp){
        System.out.println("-----debug: emp = " + emp);
        return "index";
    }

    /**
     * 给对象赋值，获得list集合
     * @param empVO
     * @return
     */
    @GetMapping("/list")
    public String index(EmpVO empVO){
        System.out.println("-----debug: empVO = " + empVO);
        return "index";
    }

    @GetMapping("/array")
    public String index(String[] username){
        for (String s : username) {
            System.out.println("-----debug: name = " + s);
        }
        return "index";
    }

}
