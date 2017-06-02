package com.zhaoyuncapital.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * Created by gongtuo on 2017/6/2.
 */
@Controller
public class HelloController {
    private Logger logger= Logger.getLogger(HelloController.class);

    @RequestMapping("/hello")
    public String greeting(@RequestParam(value="name",required = false,defaultValue = "Wold")String name,Model model){
        logger.info("hello");
        model.addAttribute("name",name);
        return "hello";
    }
}
