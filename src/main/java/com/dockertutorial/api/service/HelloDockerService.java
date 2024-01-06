package com.dockertutorial.api.service;

import com.dockertutorial.api.model.Log;
import com.dockertutorial.api.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;

@Service
public class HelloDockerService {

    @Autowired
    LogRepository logRepository;

    public String logRestCall(){
        Log log = new Log();
        log.setDate(new Date().toString());
        log.setType("request");
        log.setTimestamp(System.currentTimeMillis());
        String response = "Hello - Response received on : " + log.toString();
        logRepository.save(log);
        return response;
    }
}
