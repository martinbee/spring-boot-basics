package com.example.chuckles.controllers;

import com.example.chuckles.services.JokeGetter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class JokeController {
  private JokeGetter jokeService;

  /**
  * @param jokeService
  */
  public JokeController(JokeGetter jokeService) {
    this.jokeService = jokeService;
  }

  @RequestMapping("/joke")
  public String getJoke(Model model) {
    String joke = jokeService.getJoke();

    model.addAttribute("joke", joke);

    return "chucknorris";
  }
}
