package com.backend.project.controller;

import com.backend.project.model.Hello;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello(){
        return "Hello";
    }

    @GetMapping("/hello/{name}")
    public Hello sayHelloAgain(@PathVariable("name") String name){
        return new Hello("Hello :- "+name);
    }

}
