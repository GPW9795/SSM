package com.gpw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InterceptorController {
    @RequestMapping("/test01")
    public String test(){
        System.out.println("test01...");
        return "success";
    }
}
