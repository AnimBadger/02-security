package dev.stephen.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {
    @GetMapping("/home")
    public String home(){
        return "Home";
    }

    @GetMapping("/restricted")
    public String restricted(){
        return "This is restricted";
    }

}
