package com.gpw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyFirstController {
    @RequestMapping("/hello")
    public String myFirstRequest() {
        System.out.println("正在处理。。。。");
        return "success";
    }
}
