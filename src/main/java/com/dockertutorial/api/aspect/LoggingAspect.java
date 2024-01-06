package com.dockertutorial.api.aspect;

import com.dockertutorial.api.service.HelloDockerService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    //https://medium.com/@toimrank/spring-boot-aop-with-example-a2757e389d0b

    @Autowired
    HelloDockerService helloDockerService;

    @Before(value="execution(* com.dockertutorial.api.controller..*(..))")
    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("New request");
    }

    @After(value="execution(* com.dockertutorial.api.controller..*(..))")
    public void afterAdvice(JoinPoint joinPoint) {
        System.out.println(helloDockerService.logRestCall());
    }
}
