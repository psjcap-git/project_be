package com.zerobase.project_be.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zerobase.project_be.error.CustomException;
import com.zerobase.project_be.error.ErrorCode;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class TestController {
    public static class testclass {
        public int a = 10;
        public String b = "string sis alkdnfa";
    }

    @GetMapping("/hello")
    public ResponseEntity<?> helloWorld() {
        log.info("TestController : /hello [GET]");
        //return ResponseEntity.ok(WebResponseData.ok(new testclass()));
        //return ResponseEntity.ok(Response.ok());
        throw new CustomException(ErrorCode.SUCCESS);        
        //return "Hello World..!!";
    }
}
