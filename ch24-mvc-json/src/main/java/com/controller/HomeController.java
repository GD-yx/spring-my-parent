package com.controller;

import com.entity.EmpVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author 南八
 */
@Controller
//@ResponseBody
//@RestController
public class HomeController {

    @RequestMapping("/index")
   // @ResponseBody
    public String index(){
        return "index";
    }

    @RequestMapping("/list")
    @ResponseBody
    public EmpVO list() {
        EmpVO empVO = new EmpVO(1,"aaa",new Date());
        return empVO;
    }

    @RequestMapping("/insert")
    @ResponseBody
    public EmpVO insert(EmpVO empVO) {
        System.out.println("-----debug: empVO = " + empVO);
        EmpVO result = new EmpVO(1, "server", new Date());
        return result;
    }


    @RequestMapping("/insert2")
    @ResponseBody
    public EmpVO insert2( EmpVO empVO) {
        System.out.println("-----debug: empVO = " + empVO);
        EmpVO result = new EmpVO(2, "server2", new Date());
        return result;
    }

}
