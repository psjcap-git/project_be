package com.zerobase.project_be.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class TestController {

    @GetMapping("/hello")
    public String helloWorld() {
        log.info("TestController : /hello [GET]");
        return "Hello World..!!";
    }
}
