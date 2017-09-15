package com.example.chuckles.controllers;

import com.example.chuckles.services.JokesGetter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class JokesController {
  private JokesGetter jokesService;

  /**
  * @param jokesService
  */
  public JokesController(JokesGetter jokesService) {
    this.jokesService = jokesService;
  }

  @RequestMapping("/jokes")
  public String getJokes(Model model) {
    model.addAttribute("jokes", jokesService.getJokes());

    return "jokes";
  }
}
