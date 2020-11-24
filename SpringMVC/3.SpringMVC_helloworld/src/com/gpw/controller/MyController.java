package com.gpw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @RequestMapping("/hello")
    public String first(){
        System.out.println("PROCESS...");
        return "success";
    }

    @RequestMapping("/user/{id}")
    public String path(@PathVariable("id") String id){
        System.out.println(id);
        return "success";
    }
}
