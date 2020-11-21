package com.gpw.dao;

import com.gpw.bean.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao extends BaseDao<User>{
    @Override
    public void save() {
        System.out.println("SAVE USER......");
    }
}
