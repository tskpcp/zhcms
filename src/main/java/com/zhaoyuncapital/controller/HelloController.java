package com.zhaoyuncapital.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by gongtuo on 2017/6/7.
 */
@Controller
public class HelloController {
    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name,Model model){
       // model.addAttribute("name",name);
        return "hello";
    }
}
