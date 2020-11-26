package com.gpw.controller;

import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

public class MyView implements View {
    @Override
    public String getContentType() {
        return "text/html";
    }

    @Override
    public void render(Map<String, ?> map, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("model:" + map);
        httpServletResponse.setContentType("text/html");
        List<String> video = (List<String>) map.get("video");
        httpServletResponse.getWriter().write("<h1>中国</h1>");
        for (String s : video) {
            httpServletResponse.getWriter().write("<a href='https://www.baidu.com'>下载" + s + ".avi</a><br>");
        }
    }
}
