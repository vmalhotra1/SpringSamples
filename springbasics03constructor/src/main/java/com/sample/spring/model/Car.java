package com.sample.spring.model;

/**
 * @author Vaibhav Malhotra
 * @since 21 Aug, 2019
 */
public class Car {
  private Engine engine;
  private Transmission transmission;

  public Car(Engine engine, Transmission transmission) {
    this.engine = engine;
    this.transmission = transmission;
  }

  @Override
  public String toString() {
    return "Car{" + "engine=" + engine + ", transmission=" + transmission + '}';
  }
}
