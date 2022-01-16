package com.dictionary.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

@Controller
public class dictionary {

    @GetMapping("/dictionary")
    public String index() {
//        ModelAndView modelAndView= new ModelAndView("views/index");
        return "index";
    }
    @PostMapping("/result")
    public String result(@RequestParam String eng_word, Model model) {
        Map<String, String> dic = DictionaryModel.dicMap();
        for (String key : dic.keySet()) {
            if (key.equalsIgnoreCase(eng_word))
                model.addAttribute("result", dic.get(key));
        }
        return "result";
    }
}
