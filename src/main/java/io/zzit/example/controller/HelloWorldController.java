package io.zzit.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zz on 2018-07-02.
 */
@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/world")
    public String hello() {
        return "Holle，Spring Boot";
    }
}
