package com.org.BussUserService.controller;

import com.org.BussUserService.model.BussUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BussUserController {

    @GetMapping("/api/users")
    public BussUser getBussUser(){
        BussUser bussUser = new BussUser();
        bussUser.setFullName("Ramanuj");
        bussUser.setEmail("abc@gmail.com");
        bussUser.setPhone("+91 8709537749");
        bussUser.setRole("Customer");
        return bussUser;
    }

}
