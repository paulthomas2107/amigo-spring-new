package com.amigoscode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController

public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/greet")
    public GreetResponse greet() {
        return new GreetResponse("Hi...", List.of("Java", "C++", "Python"), new Person("Rory", 21, 21_7000));
    }

    record Person(String name, int age, double deposit){}

    record GreetResponse(String greet,
                         List<String> favProgrammingLanguages,
                         Person person) {}
}
