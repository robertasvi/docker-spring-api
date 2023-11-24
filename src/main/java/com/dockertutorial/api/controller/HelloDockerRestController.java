package com.dockertutorial.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
class HelloDockerRestController {
    @GetMapping("/hello")
    public ResponseEntity<String> helloDocker() {
        String response = "Hello - Response received on : " + new Date();
        System.out.println(response);
        return new ResponseEntity<String>(response, HttpStatus.OK);
    }
}
