package com.example.chuckles.controllers;

import com.example.chuckles.model.Joke;
import com.example.chuckles.services.GetChuckNorrisJoke;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class JokeController {
  private GetChuckNorrisJoke getChuckNorrisJokeService;

  /**
  * @param getChuckNorrisJokeService
  */
  public JokeController(GetChuckNorrisJoke getChuckNorrisJokeService) {
    this.getChuckNorrisJokeService = getChuckNorrisJokeService;
  }

  @RequestMapping("/joke")
  public String getJoke(Model model) {
    String joke = getChuckNorrisJokeService.getJoke();

    model.addAttribute("joke", joke);

    return "chucknorris";
  }
}
