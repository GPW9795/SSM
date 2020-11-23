package com.gpw.dao;

import com.gpw.bean.Book;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao extends BaseDao<Book>{
    public void save(){
        System.out.println("SAVE BOOK......");
    }
}
