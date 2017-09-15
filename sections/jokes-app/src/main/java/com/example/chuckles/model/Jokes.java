package com.example.chuckles.model;

import java.util.List;

public class Jokes {
  private List<String> jokes;

  /**
   * @param jokes
   */
  public Jokes(List<String> jokes) {
    this.jokes = jokes;
  }

  /**
   * @return the jokes
   */
  public List<String> getJokes() {
    return jokes;
  }

  /**
   * @param jokes the jokes to set
   */
  public void setJokes(List<String> jokes) {
    this.jokes = jokes;
  }

}
