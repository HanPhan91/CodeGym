package com.codegym.controller;

import com.codegym.model.User;
import com.codegym.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/create-user")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("user", new User());
        return modelAndView;
    }

    @PostMapping("/validateUser")
    public ModelAndView checkValidation(@Validated @ModelAttribute("user") User user,
                                        BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();
        new User().validate(user, bindingResult);

        if (bindingResult.hasFieldErrors()) {
            modelAndView.setViewName("/create");
//            return new ModelAndView("/create");
            return modelAndView;
        }

        if (userService.existsByEmail(user.getEmail())) {
            modelAndView.addObject("error", "Email is exists");
            modelAndView.setViewName("/create");
        } else {

            if (userService.existsByPhoneNumber(user.getPhoneNumber())) {
                modelAndView.addObject("error", "Phone number is exists");
                modelAndView.setViewName("/create");
            } else {
                try {
                    userService.save(user);
                    modelAndView.setViewName("/result");
//            return modelAndView;
                } catch (Exception e) {
                    modelAndView.addObject("error", "Error");
                    modelAndView.setViewName("/create");
                }
            }
        }

        return modelAndView;
    }
}
