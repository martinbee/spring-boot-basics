package com.example.chuckles.services;

import com.example.chuckles.services.JokeGetter;
import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class GetChuckNorrisJoke implements JokeGetter {
  public String getJoke() {
    ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

    return chuckNorrisQuotes.getRandomQuote();
  }
}
