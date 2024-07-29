package com.example.dockerexample.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class DockerDemoApplication {
    @GetMapping("/testapi")
    public String testApi(){
        return "Heyy!! Randhir welcome to docker!!......";
    }

}
