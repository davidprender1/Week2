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

    @GetMapping("/calculate")
    public Map<String, Object> calculate(
            @RequestParam double num1,
            @RequestParam double num2,
            @RequestParam String operation) {

        double total = 0;
        String op = operation.toLowerCase();

        switch (op) {
            case "add":
                total = num1 + num2;
                break;
            case "subtract":
                total = num1 - num2;
                break;
            case "multiply":
                total = num1 * num2;
                break;
            case "divide":
                if (num2 == 0) {
                    return Map.of("operation", "divide", "warning", "Cannot divide by zero");
                }
                total = num1 / num2;
                break;
            default:
                return Map.of("error", "Invalid operation");
        }

        return Map.of("operation", op, "total", total);
    }

}
