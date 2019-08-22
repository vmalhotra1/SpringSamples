package com.sample.spring.boot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Vaibhav Malhotra
 * @since 22 Aug, 2019
 */
@Entity
public class Student {
  @Id
  @GeneratedValue
  private int id;
  private String name;

  public Student() {
  }

  public Student(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
