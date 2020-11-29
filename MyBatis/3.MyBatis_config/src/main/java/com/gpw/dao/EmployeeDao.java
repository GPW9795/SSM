package com.gpw.dao;

import com.gpw.bean.Employee;

public interface EmployeeDao {
    Employee getEmpById(Integer id);

    int updateEmployee(Employee employee);

    int deleteEmployee(Integer id);

    int insertEmployee(Employee employee);
}
