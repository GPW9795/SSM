package com.gpw.dao;

import com.gpw.bean.Employee;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface EmployeeDao {
    Employee getEmpById(Integer id);

    Map<String, Object> getEmpByIdMap(Integer id);

    Employee getEmpByIdAndName(@Param("id") Integer id, @Param("empName") String empName);

    List<Employee> getEmps();

    @MapKey("id")
    Map<Integer, Employee> getEmpsMap();

    int updateEmployee(Employee employee);

    int deleteEmployee(Integer id);

    int insertEmployee(Employee employee);
}
