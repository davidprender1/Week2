package com.example.week2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class RequestController {

    // Simple endpoint that returns "Hello World"
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    // Endpoint that greets a user by their name
    // Example: /greet/John -> "Hello John!"
    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    // Endpoint that shows name and age details
    // Example: /details?name=John&age=25
    @GetMapping("/details")
    public String details(@RequestParam String name, @RequestParam int age) {
        return "Name: " + name + " Age: " + age;
    }

    // Endpoint that returns a Person object
    @GetMapping("/person")
    public Person getPerson() {
        return new Person("David", 22);
    }

    // CalculatorAdd that performs add, subtract, multiply, or divide
    @GetMapping("/calculate")
    public CalculatorResult calculate(
            @RequestParam double num1,
            @RequestParam double num2,
            @RequestParam String operation) {

        switch (operation.toLowerCase()) {
            case "add":
                return new CalculatorResult("add", num1 + num2);
            case "subtract":
                return new CalculatorResult("subtract", num1 - num2);
            case "multiply":
                return new CalculatorResult("multiply", num1 * num2);
            case "divide":
                if (num2 == 0) {
                    // return warning if dividing by zero
                    return new CalculatorResult("divide", "Cannot divide by zero");
                }
                return new CalculatorResult("divide", num1 / num2);
            default:
                // return warning if invalid operation
                return new CalculatorResult("invalid", "Unknown operation");
        }
    }
}