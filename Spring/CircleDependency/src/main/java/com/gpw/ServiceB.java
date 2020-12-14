package com.gpw;

public class ServiceB {
    private ServiceA a;

    public ServiceA getA() {
        return a;
    }

    public void setA(ServiceA a) {
        this.a = a;
    }

    public ServiceB() {
        System.out.println("B create success.....");
    }
}
