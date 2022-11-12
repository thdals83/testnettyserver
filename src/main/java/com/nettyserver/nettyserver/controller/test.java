package com.nettyserver.nettyserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class test {
    
    @GetMapping("/test")
    @ResponseBody
    public String test() {
        return "test";
    }
}
