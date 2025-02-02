package com.dockertutorial.api.service;

import com.dockertutorial.api.model.Log;
import com.dockertutorial.api.repository.LogRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@SpringBootTest
public class TestHelloDockerService {
    @Autowired
    private HelloDockerService helloDockerService;

    @MockBean
    private LogRepository logRepository;

    @Test
    public void testLogRestCall() {
        // Arrange
        Log log = new Log();
        log.setDate(anyString());
        log.setType("request");
        log.setTimestamp(anyLong());

        when(logRepository.save(any(Log.class))).thenReturn(log);

        // Act
        String response = helloDockerService.logRestCall();

        // Assert
        assertNotNull(response);
        verify(logRepository, times(1)).save(any(Log.class));
    }
}
