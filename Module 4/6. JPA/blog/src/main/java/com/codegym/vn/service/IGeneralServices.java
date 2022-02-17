package com.codegym.vn.service;

import com.codegym.vn.model.Blog;

import java.util.List;

public interface IGeneralServices {
    List<Blog> findAll();

    Blog findById(Long id);

    void save(Blog newBlog);

    void remove(Long id);
}
