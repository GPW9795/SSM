package com.gpw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @RequestMapping("/hello")
    public String first(){
        System.out.println("PROCESS...");
        return "success";
    }
}
