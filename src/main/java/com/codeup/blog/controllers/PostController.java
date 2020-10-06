package com.codeup.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String post() {
        return "posts index page";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String userPost(@PathVariable int id) {
        return String.format("Here is post number %d", id);
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String viewPostForm() {
        return "view the form for creating a post";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String createPost() {
        return "create a new post";

    }
}
