package com.flink.test.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/test")
public class DummyController {

    @GetMapping("/get/{name}")
    public String get(@PathVariable String name){
        return "Hi "+ name;
    }
    @PostMapping("/post")
    public String post(@RequestBody String name , @RequestParam(required = false) String lastName){
        return "Hi "+ name + " "+lastName;
    }
}
