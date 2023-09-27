package com.example.apihello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiHelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiHelloApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello ADMIN..!!";
    }
}