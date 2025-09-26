package com.example.week2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class RequestController {

    @GetMapping("/hello")
    public String hello()
    {
        return "Hello World";
    }

    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name)
    {
        return "Hello " + name + "!";
    }

    @GetMapping("/details")
    public String details(@RequestParam String name,@RequestParam int age) {
        return "Name : " + name + " Age : " + age;
    }

    @GetMapping ("/person")
    public Person getperson() {
        return new Person("David", 22);
    }
}
