package com.aces.CryptoApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/public")
@RestController
public class UserController {

    @GetMapping("/custom-password")
    public String getCustomPassword(){
        return "ParolaMisto";
    }

}
