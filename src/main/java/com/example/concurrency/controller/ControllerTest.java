package com.example.concurrency.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jnlp.IntegrationService;

@RestController
@RequestMapping("/test")
public class ControllerTest {

    @GetMapping("show/{id}")
    public String show(@PathVariable("id")String id){
        return id;
    }
}
