package com.codegym.blogapp.service;

import com.codegym.blogapp.model.Blog;

public interface BlogService {

    Blog save(Blog blog);

    void delete(Blog blog);


}
