package com.example.springbatchtest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secret")
public class HomeController {

    @Value("${custom.jwt.secretKey}")
    private String jwtSecretKey;


    @GetMapping("/jwt")
    public String jwt() {
        return jwtSecretKey;
    }

}
