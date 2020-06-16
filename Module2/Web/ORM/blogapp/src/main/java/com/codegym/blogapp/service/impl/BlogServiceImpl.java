package com.codegym.blogapp.service.impl;

import com.codegym.blogapp.model.Blog;
import com.codegym.blogapp.repository.BlogRepository;
import com.codegym.blogapp.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepository blogRepository;

    @Override
    public Blog save(Blog blog) {
        return blogRepository.save(blog);
    }

    @Override
    public void delete(Blog blog) {
        blogRepository.delete(blog);

    }
}
