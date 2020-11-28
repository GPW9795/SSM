package com.gpw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class UploadContorller {
    /**
     * 多文件上传
     */
    @RequestMapping("/upload")
    public String upload(@RequestParam(value = "username", required = false) String username,
                         @RequestParam("headimg") MultipartFile[] files, Model model) {
        for (MultipartFile file : files) {
            if (!file.isEmpty()) {
                try {
                    file.transferTo(new File("\\Users\\gaopeiwen\\Desktop\\JavaCode\\" + file.getOriginalFilename()));
                    model.addAttribute("msg", "文件上传成功了");
                } catch (IOException e) {
                    model.addAttribute("msg", "文件上传失败了");
                }
            }
        }
        return "forward:/index.jsp";
    }

//    @RequestMapping("/upload")
//    public String upload(@RequestParam(value = "username", required = false) String username,
//                         @RequestParam("headimg") MultipartFile file, Model model) {
//        System.out.println(file.getOriginalFilename());
//        System.out.println(file.getName());
//        try {
//            file.transferTo(new File("\\Users\\gaopeiwen\\Desktop\\JavaCode" + file.getOriginalFilename()));
//            model.addAttribute("msg", "文件上传成功了");
//        } catch (Exception e) {
//            model.addAttribute("msg", "文件上传失败了");
//        }
//        return "forward:/index.jsp";
//    }
}
