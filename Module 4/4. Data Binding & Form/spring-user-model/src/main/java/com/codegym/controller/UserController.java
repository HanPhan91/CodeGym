package com.codegym.controller;

import com.codegym.dao.UserDao;
import com.codegym.model.Login;
import com.codegym.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserController {

    @GetMapping("/home")
    public ModelAndView home() {
//        ModelAndView modelAndView = new ModelAndView("home", "login", new Login());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");
        Login formLogin = new Login();
        modelAndView.addObject("login", formLogin);

        return modelAndView;
    }

    @PostMapping("/login")
    public ModelAndView login(@ModelAttribute("login") Login login){
        User userLogin = UserDao.checkLogin(login);
        if(userLogin == null){
            ModelAndView modelAndView = new ModelAndView("error");
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("user");
            modelAndView.addObject("user", userLogin);
            return modelAndView;
        }
    }
}