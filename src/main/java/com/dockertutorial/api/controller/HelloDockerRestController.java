package com.dockertutorial.api.controller;

import com.dockertutorial.api.service.HelloDockerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
class HelloDockerRestController {

    @Autowired
    HelloDockerService helloDockerService;

    @GetMapping("/hello")
    public ResponseEntity<String> helloDocker() {
        return new ResponseEntity<String>(new Date().toString(), HttpStatus.OK);
    }
}
