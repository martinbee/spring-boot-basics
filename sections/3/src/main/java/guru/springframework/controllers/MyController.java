package guru.springframework.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by jt on 5/23/17.
 */
@Controller
public class MyController {
  private String test;

    public String hello(){
        System.out.println("Hello!!! ");

        return "foo";
  }

  /**
   * @return the test
   */
  public String getTest() {
    return test;
  }

  /**
   * @param test the test to set
   */
  public void setTest(String test) {
    this.test = test;
  }
}
