package com.example.chuckles.services;

import com.example.chuckles.services.JokeGetter;
import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class GetChuckNorrisJoke implements JokeGetter {
  private final ChuckNorrisQuotes chuckNorrisQuotes;

  /**
  * @param chuckNorrisQuotes
  */
  public GetChuckNorrisJoke() {
    this.chuckNorrisQuotes = new ChuckNorrisQuotes();
  }

  public String getJoke() {
    return chuckNorrisQuotes.getRandomQuote();
  }
}
