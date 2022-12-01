package com.velocity.demo.velocitydemopublic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/hello")
    public String helloVelocity(){
        return "Hello Velocity!";
    }

}
