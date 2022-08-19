package com.ouz.k8sdemo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
@Slf4j
public class GreetingsConfig {


    @Value("${hello.greetings}")
    private String greetings;
    @Value("${hello.to}")
    private String to;

    @Scheduled(cron = "* * * * * *")
    public void scheduledHello(){

        log.info("Greetings from scheduled job ! ");
        log.info("Greetings : "+greetings + " " + to);
    }
}
