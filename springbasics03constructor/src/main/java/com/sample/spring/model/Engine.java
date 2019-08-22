package com.sample.spring.model;

/**
 * @author Vaibhav Malhotra
 * @since 21 Aug, 2019
 */
public class Engine {
  private String type;
  private int gearCount;

  public Engine(String type, int gearCount) {
    this.type = type;
    this.gearCount = gearCount;
  }

  public String getType() {
    return type;
  }

  public int getGearCount() {
    return gearCount;
  }

  @Override
  public String toString() {
    return "Engine{" + "type='" + type + '\'' + ", gearCount=" + gearCount + '}';
  }
}
