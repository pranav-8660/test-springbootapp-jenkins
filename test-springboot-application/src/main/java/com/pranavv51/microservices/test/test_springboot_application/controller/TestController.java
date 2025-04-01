package com.pranavv51.microservices.test.test_springboot_application.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping(value = "/")
    public ResponseEntity<String> sampleTestMessage(){
        return ResponseEntity.ok("Hi, this is a test message");
    }
}
