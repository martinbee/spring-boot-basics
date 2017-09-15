package com.example.chuckles.model;

public class Joke {
  private String joke;

  public Joke() {}

  /**
  * @param joke
  */
  public Joke(String joke) {
    this.joke = joke;
  }

  /**
   * @return the joke
   */
  public String getjoke() {
    return joke;
  }

  /**
   * @param joke the joke to set
   */
  public void setjoke(String joke) {
    this.joke = joke;
  }
}
