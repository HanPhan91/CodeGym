package com.codegym.controller;

import com.codegym.model.Setting;
import com.codegym.services.Services;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @GetMapping("home")
    public ModelAndView home(){
        Setting setting= Services.getSetting();
        ModelAndView modelAndView= new ModelAndView("formSetting");
        modelAndView.addObject("setting",new Setting());
        return modelAndView;
    }
    @PostMapping("info")
    public ModelAndView info(@ModelAttribute ("setting") Setting newSetting){
        Services.changeSetting(newSetting);
        ModelAndView modelAndView= new ModelAndView("info","setting",Services.getSetting());
        return modelAndView;
    }
    @GetMapping("info")
    public ModelAndView getInfo(){
        ModelAndView modelAndView= new ModelAndView("info","setting",Services.getSetting());
        return modelAndView;
    }
}
