package com.codegym.vn.repository;

import com.codegym.vn.model.Blog;

import java.util.List;

public interface IGeneralRepository {
    List<Blog> findAll();

    Blog findById(Long id);

    void save(Blog newBlog);

    void remove(Long  id);
}
