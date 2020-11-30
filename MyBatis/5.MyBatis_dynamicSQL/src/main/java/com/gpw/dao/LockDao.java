package com.gpw.dao;

import com.gpw.bean.Lock;

public interface LockDao {
    Lock getLockById(Integer id);

    Lock getLockByIdSimple(Integer id);
}
