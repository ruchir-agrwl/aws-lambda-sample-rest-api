package com.ruchir.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LambdatestController {

    @GetMapping("/hello")
    public String helloLambda(){
        System.out.println("Hello from @GetMapping Lambda!");
        return "Hello from Lambda!";
    }

    @GetMapping("/hello1")
    public String helloLambda1(){
        System.out.println("Hello from @GetMapping 1 Lambda!");
        return "Hello from @GetMapping 1 Lambda!";
    }

    @PostMapping("/hello2")
    public String helloLambda2(){
        System.out.println("Hello from @PostMapping Lambda!");
        return "Hello from @PostMapping Lambda!";
    }
}
