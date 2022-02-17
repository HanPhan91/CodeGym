package com.codegym.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class sandwichCondiments {
    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/list-condiments")
    public String save(@RequestParam("condiments") String[] condiments, Model model){
        model.addAttribute("condiments",condiments);
        return "listCondiments";
    }
}
