package com.gpw.controller;

import com.gpw.bean.Employee;
import com.gpw.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

@Controller
public class AjaxController {

    @Autowired
    EmployeeDao employeeDao;

    @ResponseBody
    @RequestMapping("/getall")
    public Collection<Employee> ajaxGetAll() {
        Collection<Employee> all = employeeDao.getAll();
        return all;
    }

    @RequestMapping("/request")
    public String test(@RequestBody String body){
        System.out.println(body);
        return "success";
    }
}
