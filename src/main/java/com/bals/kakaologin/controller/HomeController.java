package com.bals.kakaologin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

    @RequestMapping(value="/login")
    public String login(@RequestParam("code") String code) {
        System.out.println("code : " + code);
        return "index";
    }
}
