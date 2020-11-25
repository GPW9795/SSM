package com.gpw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
//@SessionAttributes(value = "msg", types = String.class)
public class OutputController {
    @RequestMapping("/handle")
    public String handle(Map<String, Object> map) {
        map.put("msg", "hello");
        System.out.println(map.getClass());
        return "success";
    }

    @RequestMapping("/handle01")
    public String handle01(Model model) {
        model.addAttribute("msg", "love you");
        System.out.println(model.getClass());
        return "success";
    }

    @RequestMapping("/handle02")
    public String handle02(ModelMap modelMap) {
        modelMap.addAttribute("msg", "hate you");
        System.out.println(modelMap.getClass());
        return "success";
    }

    @RequestMapping("/handle03")
    public ModelAndView handle03() {
        ModelAndView view = new ModelAndView("success");
        view.addObject("msg", "hello");
        return view;
    }

    @RequestMapping("/handle04")
    public ModelAndView handle04() {
        ModelAndView view = new ModelAndView("success");
        view.addObject("msg", "hello");
        return view;
    }
}
