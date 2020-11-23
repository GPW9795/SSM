package com.gpw.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao {
    public void saveBook(){
        System.out.println("SAVE......");
    }
}
