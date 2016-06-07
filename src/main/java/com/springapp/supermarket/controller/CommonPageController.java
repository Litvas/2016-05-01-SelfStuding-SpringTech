package com.springapp.supermarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// DONE!
@RequestMapping("/supermarket")
@Controller
public class CommonPageController {

    // Return home page with links to another page
    @RequestMapping("/")
    public String auth() {
        return "login";
    }

    @RequestMapping("/index")
     public String printWelcome() {

        return "index";
    }

    @RequestMapping("/deny")
    public String accessDenided() {
        return "accessdenided";
    }
}