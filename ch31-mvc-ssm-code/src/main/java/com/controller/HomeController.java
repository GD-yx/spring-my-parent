package com.controller;

import com.entity.Dept;
import com.service.DeptService;
import com.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 南八
 */
@Controller
public class HomeController {
    @Autowired
    private DeptService service;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/list")
    @ResponseBody
    public ResponseVO list(
            @RequestParam(value = "pageNum",defaultValue = "1",required = false) int pageNum,
            @RequestParam(value = "pageSize",defaultValue = "3",required = false) int pageSize){
        List<Dept> result = service.getAll(pageNum, pageSize);

        ResponseVO responseVO = new ResponseVO();
        responseVO.setCode("200");
        responseVO.setMsg("success");
        responseVO.setData(result);
        return responseVO;
    }

}
