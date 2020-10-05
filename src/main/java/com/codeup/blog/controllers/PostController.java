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
        public String userPost(@PathVariable String id) {
            return "view an individual post";
        }

        @GetMapping("/posts/create")
        @ResponseBody
        public String viewPostForm() {
            return "view the form for creating a post";
        }
    @RequestMapping(path = "/posts/create", method = RequestMethod.POST)
    @ResponseBody
    public String createPost() {
        return "create a new post";

    }
}
