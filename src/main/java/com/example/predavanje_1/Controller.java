package com.example.predavanje_1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String sayHello() {
        return "Pozdrav Andrija! ivan je";

    }
}