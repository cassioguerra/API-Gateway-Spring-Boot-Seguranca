package com.example.cliente.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class Cliente {

    @GetMapping
    public String getClient(){
        return  "HELLO CLIENTE";
    }
}
