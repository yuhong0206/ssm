package com.springmvc.soft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 宏锅锅 on 2017/1/2.
 */
@Controller
@RequestMapping("/")
public class MainController {

    @RequestMapping()
    public String initWelcome(){
        return "index";
    }
}
