package com.codegym.vn.service.Impl;

import com.codegym.vn.model.Blog;
import com.codegym.vn.repository.IBlogRepository;
import com.codegym.vn.service.IBlogServices;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BlogService implements IBlogServices {
    @Autowired
    private IBlogRepository blogRepository;

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Blog findById(Long id) {
        return blogRepository.findById(id);
    }

    @Override
    public void save(Blog newBlog) {
        blogRepository.save(newBlog);
    }

    @Override
    public void remove(Long id) {
        blogRepository.remove(id);
    }
}
