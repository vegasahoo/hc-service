package com.satya.hc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/health")
    public ResponseEntity<String> healthCheck(){
        String message = "status" + " : "+ "UP";
        logger.info("working {}", message);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
