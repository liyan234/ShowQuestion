package com.example.demostudytwo.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.Response;

@ControllerAdvice  //control在执行的时候 都会拦截到，拦截到后的处理
//指定身份 拦截Controller中web请求的类

public class AppControllerAdvice{

    //指定 处理 请求方法中抛出的异常
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Object handle(Exception e) {
        e.printStackTrace();//不打印的话 相当于吃了异常不会在后台打印
        return null;
    }
}
