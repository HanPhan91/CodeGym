package com.codegym.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConverMoney {
    @GetMapping("/convert")
    public String convert(){
        return "index";
    }
    @PostMapping("/result")
    public String result(@RequestParam String usd, Model model){
        float result= Float.parseFloat(usd) * 24000;
        model.addAttribute("result",result);
        return  "result";
    }
}
