package com.pranavv51.microservices.test.test_springboot_application.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping(value = "/")
    public ResponseEntity<String> sampleTestMessage(){
        return ResponseEntity.ok("Hi, this is a test message..after new commit!");
    }

    @GetMapping(value = "/ping")
    public ResponseEntity<String> pingFunc(){
        return ResponseEntity.ok("fvbejfdkjdnfkjdsnfkdn");
    }

    @GetMapping(value = "/newtest")
    public ResponseEntity<String> newTest(){
        return ResponseEntity.ok("New test commit!!");
    }

    @GetMapping(value = "/random")
    public ResponseEntity<String> newTestRand(){
        return ResponseEntity.ok("New test random commit!!");
    }

    @GetMapping(value = "/hello")
    public ResponseEntity<String> newTestRandHello(){
        return ResponseEntity.ok("Hello, hey, hi test random commit!!");
    }

}
