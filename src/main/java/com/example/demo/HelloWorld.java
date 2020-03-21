package com.example.demo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class HelloWorld {
    @PostConstruct
    void Hello(){
        System.out.println("Hello");
    }
}
