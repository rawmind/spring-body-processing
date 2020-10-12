package com.test;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

@RestController
@ComponentScan("com.test")
public class TestController {

    @PostMapping("/check")
    @ResponseBody
    public void check(@RequestBody String body) {
        System.out.println("in check, body: "+body);
    }

}
