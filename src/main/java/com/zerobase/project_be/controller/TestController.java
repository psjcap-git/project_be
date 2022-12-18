package com.zerobase.project_be.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zerobase.project_be.error.CustomException;
import com.zerobase.project_be.error.ErrorCode;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class TestController {

    @GetMapping("/hello")
    public String helloWorld() {
        log.info("TestController : /hello [GET]");
        throw new CustomException(ErrorCode.SUCCESS);        
        //return "Hello World..!!";
    }
}
