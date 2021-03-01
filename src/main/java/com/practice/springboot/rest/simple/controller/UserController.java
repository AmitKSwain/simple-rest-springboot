package com.practice.springboot.rest.simple.controller;

import com.practice.springboot.rest.simple.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @GetMapping("/")
    public String healthCheck(){
        return "OK";
    }
    //pass parameters using query params
    @GetMapping("/greet")
    public String greet(@RequestParam("name") String name){
        return "Hello "+name;
    }

    //pass parameters using path variable
    @GetMapping("/bye/{name}")
    public String sayBye(@PathVariable("name") String name){
        return "Bye "+name;
    }

    //inpost using request body
    @PostMapping("/register")
    public String registerUser(@RequestBody User user){
        return "User :"+user.getName()+" is registered .";
    }
}
