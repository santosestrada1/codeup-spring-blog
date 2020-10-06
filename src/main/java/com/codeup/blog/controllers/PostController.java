package com.codeup.blog.controllers;

import com.codeup.blog.repository.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {
    private final PostRepository postRepo;

    public PostController(PostRepository postRepo){
        this.postRepo = postRepo;
    }

    @RequestMapping(path = "/posts", method = RequestMethod.GET)
    public String showAllPosts(Model model) {
        model.addAttribute("posts", postRepo.findAll());
        return "posts/index";
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
