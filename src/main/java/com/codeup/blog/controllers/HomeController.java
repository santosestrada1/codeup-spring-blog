package com.codeup.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "This is the landing page!";
    }


    @GetMapping("/home")
    public String hello() {
        return "home";
    }

    @GetMapping("/roll-dice")
    public String showDiceForm() {
        return "dice";
    }

    @PostMapping("/roll-dice")
    public String showDiceResult(@RequestParam(name = "number") int number, Model model) {
        int numberRolled = (int) ((Math.random() * 6) + 1);

        String message = "you selected " + number + " and the number rolled was " + numberRolled + ".";
        if (number == numberRolled) {
            message += " You Won!";
        } else {
            message += "Oh well.... try again!";
        }
        model.addAttribute("message", message);
        return "dice";
    }
}

