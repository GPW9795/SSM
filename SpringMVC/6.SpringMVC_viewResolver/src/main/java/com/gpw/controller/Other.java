package com.gpw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Other {
    @RequestMapping("/handleplus")
    public String handleplus(Model model){
        List<String> vname = new ArrayList<>();
        List<String> imgname = new ArrayList<>();
        vname.add("gpw");
        vname.add("cbx");
        imgname.add("ggg");
        imgname.add("hhh");
        model.addAttribute("video",vname);
        model.addAttribute("imgs",imgname);
        return "haha:/success";
    }
}
