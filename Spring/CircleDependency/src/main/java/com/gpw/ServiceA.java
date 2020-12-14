package com.gpw;

public class ServiceA {
    private ServiceB b;

    public ServiceB getB() {
        return b;
    }

    public void setB(ServiceB b) {
        this.b = b;
    }

    public ServiceA() {
        System.out.println("A create success.....");
    }
}
