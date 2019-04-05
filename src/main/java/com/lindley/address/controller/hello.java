package com.lindley.address.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {

    @RequestMapping("/hello")
    public ResponseEntity<String> sayHello() {
        return new ResponseEntity<String>("Hello world!", HttpStatus.OK);
    }
}
