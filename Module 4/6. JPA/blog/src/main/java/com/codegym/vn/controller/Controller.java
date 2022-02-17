package com.codegym.vn.controller;

import com.codegym.vn.model.Blog;
import com.codegym.vn.service.IBlogServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private IBlogServices blogServices;

    @GetMapping("/blogs")
    public ModelAndView listBlogs() {
        List<Blog> blogs = blogServices.findAll();
        ModelAndView modelAndView = new ModelAndView("/list");
        modelAndView.addObject("blogs", blogs);
        return modelAndView;
    }

    @GetMapping("/create-blog")
    public ModelAndView createForm() {
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("blog", new Blog());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView createBlog(@ModelAttribute("blog") Blog blog) {
        blogServices.save(blog);
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("blog", new Blog());
        modelAndView.addObject("message", "Created new blog");
        return modelAndView;
    }

    @GetMapping("/edit-blog/{id}")
    public ModelAndView editForm(@PathVariable Long id) {
        Blog blog = blogServices.findById(id);
        if (blog != null) {
            ModelAndView modelAndView = new ModelAndView("/edit");
            modelAndView.addObject("blog", blog);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("/error");
            return modelAndView;
        }
    }

    @PostMapping("/edit")
    public ModelAndView edit(@ModelAttribute("blog") Blog blog){
        blogServices.save(blog);
        ModelAndView modelAndView=new ModelAndView("/edit");
        modelAndView.addObject("blog",blog);
        modelAndView.addObject("message","Updated blog");
        return modelAndView;
    }

    @GetMapping("/remove/{id}")
    public String remove(@PathVariable Long id, RedirectAttributes redirectAttributes){
        blogServices.remove(id);
        redirectAttributes.addFlashAttribute("message","Removed blog");
        return "redirect:/blogs";
    }
}
