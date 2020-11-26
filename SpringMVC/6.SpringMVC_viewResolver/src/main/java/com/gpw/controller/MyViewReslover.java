package com.gpw.controller;

import org.springframework.core.Ordered;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

public class MyViewReslover implements ViewResolver, Ordered {
    private int order;
    @Override
    public View resolveViewName(String s, Locale locale) throws Exception {
        if (s.startsWith("haha:")) {
            return new MyView();
        } else {
            return null;
        }
    }

    @Override
    public int getOrder() {
        return order;
    }

    public void setOrder(int order){
        this.order = order;
    }
}
