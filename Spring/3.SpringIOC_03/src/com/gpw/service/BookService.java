package com.gpw.service;

import com.gpw.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookDao bookDao;

    public void save(){
        System.out.println("bookService helping you..... ");
        bookDao.saveBook();
    }
}
