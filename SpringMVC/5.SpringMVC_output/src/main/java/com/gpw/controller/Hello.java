package com.gpw.controller;

import com.gpw.pojo.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Hello {
    @RequestMapping("/hello")
    public String first(@RequestParam(value = "username", required = false) String username,
                        @RequestHeader(value = "User-Agent", required = false) String userAgent,
                        @CookieValue(value = "JSESSIONID", required = false) String jid) {
        System.out.println(username);
        System.out.println(userAgent);
        System.out.println(jid);
        return "success";
    }

    @RequestMapping("/book")
    public String addBook(Book book) {
        System.out.println(book);
        return "success";
    }
}
