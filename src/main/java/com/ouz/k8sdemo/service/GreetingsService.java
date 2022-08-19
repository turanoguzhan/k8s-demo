package com.ouz.k8sdemo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GreetingsService {

    @Value("${hello.greetings}")
    private String greetings;
    @Value("${hello.to}")
    private String to;

    public String greetings(){
        String message = greetings + " " + to;

        log.info("Greetings from service via endpoint !");
        log.info("Greetings : "+greetings + " " + to);

        return message;
    }
}
