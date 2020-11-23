package com.gpw.servlet;


import com.gpw.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookServlet {
    @Autowired
    private BookService bookService;

    public void doGet(){
        bookService.save();
    }
}
