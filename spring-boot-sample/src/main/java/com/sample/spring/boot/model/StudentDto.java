package com.sample.spring.boot.model;

/**
 * @author Vaibhav Malhotra
 * @since 22 Aug, 2019
 */
public class StudentDto {
  private String name;

  public StudentDto() {
  }

  public StudentDto(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
