package com.example.chuckles.controllers;

import com.example.chuckles.model.Joke;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class JokeController {

  @RequestMapping("/joke")
  public String getJoke(Model model) {
    model.addAttribute("joke", "haha");

    return "chucknorris";
  }
}
