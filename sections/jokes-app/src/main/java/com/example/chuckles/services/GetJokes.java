package com.example.chuckles.services;

import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.example.chuckles.services.JokesGetter;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class GetJokes implements JokesGetter {
  public List<String> getJokes() {
    ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();
    List<String> jokes = new ArrayList<String>();

    int numberOfJokes = 4;

    for (int i=0; i < numberOfJokes; i++) {
      jokes.add(chuckNorrisQuotes.getRandomQuote());
    }

    return jokes;
  }
}
