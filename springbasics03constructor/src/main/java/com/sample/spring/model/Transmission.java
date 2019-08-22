package com.sample.spring.model;

/**
 * @author Vaibhav Malhotra
 * @since 21 Aug, 2019
 */
public class Transmission {
  private String style;

  public Transmission(String style) {
    this.style = style;
  }

  public String getStyle() {
    return style;
  }

  @Override
  public String toString() {
    return "Transmission{" + "style='" + style + '\'' + '}';
  }
}
