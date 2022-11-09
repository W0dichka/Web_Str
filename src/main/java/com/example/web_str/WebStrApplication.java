package com.example.web_str;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
@RestController
public class WebStrApplication {

    public static void main(String[] args) {

        SpringApplication.run(WebStrApplication.class, args);
    }


    @PostMapping("/add")
    public String addCustomer(@RequestParam String first, @RequestParam String second) {
        Facade a = new Facade();
        return concat(first, second);
    }

}
