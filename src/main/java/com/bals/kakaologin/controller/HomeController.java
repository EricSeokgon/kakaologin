package com.bals.kakaologin.controller;

import com.bals.kakaologin.service.KakaoAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @Autowired
    private KakaoAPI kakao;

    @RequestMapping(value="/")
    public String index() {
        return "index";
    }

    @RequestMapping(value="/login")
    public String login(@RequestParam("code") String code) {
        String access_Token = kakao.getAccessToken(code);
        System.out.println("controller access_token : " + access_Token);
        return "index";
    }
}
