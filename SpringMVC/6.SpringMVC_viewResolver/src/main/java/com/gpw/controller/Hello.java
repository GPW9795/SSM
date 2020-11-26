package com.gpw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
//    @RequestMapping("/hello")
//    public String hello() {
//        return "../../hello";
//    }

    @RequestMapping("/handle")
    public String handle() {
        return "forward:/hello.jsp";
    }

    @RequestMapping("/handle1")
    public String handle1() {
        return "forward:/handle";
    }

    @RequestMapping("/handle2")
    public String handle2() {
        return "redirect:/hello.jsp";
    }

    @RequestMapping("/handle3")
    public String handle3() {
        return "redirect:/handle2";
    }
}
