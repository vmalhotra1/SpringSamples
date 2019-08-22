package com.sample.spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Vaibhav Malhotra
 * @since 21 Aug, 2019
 */
@Component("amaze")
public class Car {

  @Autowired
  private Engine engine;

  @Autowired
  private Transmission transmission;

  @Override
  public String toString() {
    return "Car{" + "engine=" + engine + ", transmission=" + transmission + '}';
  }
}
