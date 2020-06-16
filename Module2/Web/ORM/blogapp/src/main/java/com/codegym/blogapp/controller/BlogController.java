package com.codegym.blogapp.controller;

import com.codegym.blogapp.model.Blog;
import com.codegym.blogapp.service.impl.BlogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;


@RestController
public class BlogController {

    @Autowired
    private BlogServiceImpl blogService;

    @RequestMapping(value = "/blog/create", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ModelAndView showCreatForm() {

        return new ModelAndView("blog/create", "blog", new Blog());
    }

    @RequestMapping(value = "/blog/create", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ModelAndView saveBlog(@ModelAttribute("blog") Blog blog) {
        blog.setDatepost(new Date(System.currentTimeMillis()));
        blogService.save(blog);
        ModelAndView modelAndView = new ModelAndView("/blog/create");
        modelAndView.addObject("blog", new Blog());
        modelAndView.addObject("message", "new customer created");
        return modelAndView;
    }

    @RequestMapping(value = "blog/delete/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ModelAndView showDeleteForm(@PathVariable Long id) {

    }
}