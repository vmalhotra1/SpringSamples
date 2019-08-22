package com.sample.spring.basics;

import org.springframework.context.annotation.Bean;

/**
 * @author Vaibhav Malhotra
 * @since 20 Aug, 2019
 */
public class HelloWorld {
  private String message;

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
