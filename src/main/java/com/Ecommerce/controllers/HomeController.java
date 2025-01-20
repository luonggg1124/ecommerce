package com.Ecommerce.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String Home(ModelMap modelMap){
        modelMap.addAttribute("title","Trang chủ");

        return "index";
    }
}
