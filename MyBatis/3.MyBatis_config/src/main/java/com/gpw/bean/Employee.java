package com.gpw.bean;

public class Employee {
    private Integer id;
    private String empname;
    private String email;
    private Integer gender;

    public Employee() {
    }

    public Employee(Integer id, String empname, String email, Integer gender) {
        this.id = id;
        this.empname = empname;
        this.email = email;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empName) {
        this.empname = empName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", empname='" + empname + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
