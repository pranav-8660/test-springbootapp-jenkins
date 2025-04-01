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

    @GetMapping(value = "/ping")
    public ResponseEntity<String> pingFunc(){
        return ResponseEntity.ok("PONG!!");
    }

    @GetMapping(value = "/newtest")
    public ResponseEntity<String> newTest(){
        return ResponseEntity.ok("New test commit!!");
    }

}
