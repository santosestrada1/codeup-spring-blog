package com.codeup.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {
    @GetMapping(path = "/add/{number1}/and/{number2}")
    @ResponseBody
    public String add(@PathVariable int number1, @PathVariable int number2) {
        return (number1 + number2) + "!";
    }

    @RequestMapping(path = "/subtract/{number1}/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String subtract(@PathVariable int number1, @PathVariable int number2) {
        return (number1 - number2) + "!";
    }

    @RequestMapping(path = "/multiply/{number1}/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String multiply(@PathVariable int number1, @PathVariable int number2) {
        return (number1 * number2) + "!";
    }

    @RequestMapping(path = "/divide/{number1}/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String divide(@PathVariable int number1, @PathVariable int number2) {
        return (number1 / number2) + "!";
    }
}
