package com.org.BussUserService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/homecontroller")
    public String homeController(){
        return "Home Controller for Business User microservice ";
    }
}
