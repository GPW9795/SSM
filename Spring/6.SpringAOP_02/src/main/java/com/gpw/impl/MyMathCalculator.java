package com.gpw.impl;

public class MyMathCalculator {
    public int add(int i, double j) {
        System.out.println("方法内部执行");
        return 0;
    }

    public int add(int i, int j) {
        int result = i + j;
        System.out.println("方法内部执行");
        return result;
    }

    public int sub(int i, int j) {
        int result = i - j;
        System.out.println("方法内部执行");
        return result;
    }

    public int mul(int i, int j) {
        //方法的兼容性；
        int result = i * j;
        System.out.println("方法内部执行");
        return result;
    }

    public int div(int i, int j) {
        int result = i / j;
        System.out.println("方法内部执行");
        return result;
    }
}
