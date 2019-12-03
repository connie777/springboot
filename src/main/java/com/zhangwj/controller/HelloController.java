package com.zhangwj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author Silence
 * @Date 2019/12/3 16:55
 * @Version 1.0
 **/
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(HttpServletRequest request){
        System.out.println(request.getRequestURI());
        System.out.println(request.getRemoteHost());
        return "hello SpringBoot";
    }
}
