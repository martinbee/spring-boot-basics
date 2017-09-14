package main.java.com.example.chuckles.services;

import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class GetChuckNorrisJoke implements JokeGetter {
  public String getJoke() {
    ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

    return chuckNorrisQuotes.getRandomQuote();
  }
}
