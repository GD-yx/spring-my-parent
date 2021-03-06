package com.exception;

import com.vo.ResponseVO;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 南八
 */
@ControllerAdvice
public class SystemExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public ResponseVO handleRuntimeException(){
        ResponseVO responseVO = new ResponseVO();
        responseVO.setCode("500");
        responseVO.setMsg("failed");
        return responseVO;
    }
}
