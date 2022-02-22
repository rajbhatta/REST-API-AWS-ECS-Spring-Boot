package com.example.awsecsspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example.*")
@SpringBootApplication
public class AwsEcsSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(AwsEcsSpringBootApplication.class, args);
    }

}
