package com.sample.spring.boot.dao;

import com.sample.spring.boot.model.Student;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Vaibhav Malhotra
 * @since 22 Aug, 2019
 */
@Component
public class StudentDaoCoolImpl implements StudentDao {
  private Map<Integer, Student> studentMap = new HashMap<>();

  StudentDaoCoolImpl() {
    studentMap.put(1, new Student(1, "Ram"));
    studentMap.put(2, new Student(2, "Shyam"));
  }

  @Override
  public Student getStudentById(int id) {
    System.out.println("I am cool!");
    return studentMap.get(id);
  }
}
