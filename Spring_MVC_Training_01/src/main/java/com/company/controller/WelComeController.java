package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelComeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getHomePage() {
        return "welcome";
    }
}
