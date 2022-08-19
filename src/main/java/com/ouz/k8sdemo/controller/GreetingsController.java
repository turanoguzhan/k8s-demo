package com.ouz.k8sdemo.controller;

import com.ouz.k8sdemo.service.GreetingsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
@RequiredArgsConstructor
public class GreetingsController {

    private final GreetingsService greetingsService;

    @GetMapping("/say-hello")
    public ResponseEntity sayHello(){

        return ResponseEntity.ok(greetingsService.greetings());
    }
}
