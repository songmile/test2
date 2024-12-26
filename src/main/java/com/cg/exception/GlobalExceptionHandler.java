package com.cg.exception;

import com.cg.common.Result;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(BusinessException.class)
    public Result<BusinessException> handleBusException(HttpServletRequest request,
                                                        HttpServletResponse response,
                                                        BusinessException ex){

        return new Result<BusinessException>(400,ex.getMessage(),ex);
    }

    @ExceptionHandler(Exception.class)
    public Result<Exception> handleBusException(HttpServletRequest request,
                                                       HttpServletResponse response,
                                                       Exception ex){
        String uri=request.getRequestURI();
        String method=request.getMethod();
        System.out.println("调用接口发生异常，接口路径"+uri+",具体异常信息："+ex.getMessage());
        return new Result<Exception>(500,"抱歉，服务器出现了异常，正在加紧修复中",ex);
    }
}
