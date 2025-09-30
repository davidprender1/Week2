package com.example.week2;

public class Person {
    private String name;  // stores the person's name
    private int age;      // stores the person's age

    // Constructor to create a new Person with a name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }
}
