package com.test.testing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class newclass {
    @GetMapping("/welcome")
    public String name(){
        return "Hello world";
    }
}
