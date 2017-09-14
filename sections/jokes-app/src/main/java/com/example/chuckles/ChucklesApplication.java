package com.example.chuckles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChucklesApplication {

  public static void main(String[] args) {
    SpringApplication.run(ChucklesApplication.class, args);
    System.out.println("Hello");
  }
}
