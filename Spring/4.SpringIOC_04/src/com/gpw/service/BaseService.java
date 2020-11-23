package com.gpw.service;

import com.gpw.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class BaseService<T> {
    @Autowired
    BaseDao<T> baseDao;

    public void save() {
        System.out.println("自动注入的DAO：" + baseDao);
        baseDao.save();
    }
}
