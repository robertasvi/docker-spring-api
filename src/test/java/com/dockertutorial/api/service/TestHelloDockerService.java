package com.dockertutorial.api.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class TestHelloDockerService {

    @Autowired
    HelloDockerService helloDockerService;

    @Test
    public void testLogRestCall() {
        String log = helloDockerService.logRestCall();
        Assert.hasText(log);
    }
}
