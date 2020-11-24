package com.gpw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookController {
    @RequestMapping(value = "/book/{id}", method = RequestMethod.GET)
    public String getBook(@PathVariable("id") Integer id) {
        System.out.println("查询到了图书" + id);
        return "success";
    }

    @RequestMapping(value = "/book/{id}", method = RequestMethod.DELETE)
    public String deleteBook(@PathVariable("id") Integer id) {
        System.out.println("删除了图书" + id);
        return "success";
    }

    @RequestMapping(value = "/book/{id}", method = RequestMethod.PUT)
    public String updateBook(@PathVariable("id") Integer id) {
        System.out.println("更新了图书" + id);
        return "success";
    }

    @RequestMapping(value = "/book", method = RequestMethod.POST)
    public String addBook() {
        System.out.println("添加了图书");
        return "success";
    }

}
