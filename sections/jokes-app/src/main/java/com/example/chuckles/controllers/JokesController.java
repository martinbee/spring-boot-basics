package com.example.chuckles.controllers;

import com.example.chuckles.services.GetJokes;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class JokesController {
  private GetJokes getJokesService;

  /**
  * @param getJokesService
  */
  public JokesController(GetJokes getJokesService) {
    this.getJokesService = getJokesService;
  }

  @RequestMapping("/jokes")
  public String getJokes(Model model) {
    model.addAttribute("jokes", getJokesService.getJokes());

    return "jokes";
  }
}
