package com.sample.spring.boot.service;

import com.sample.spring.boot.model.Student;
import com.sample.spring.boot.model.StudentDto;

import java.util.List;

/**
 * @author Vaibhav Malhotra
 * @since 22 Aug, 2019
 */
public interface StudentService {

  Student getStudentById(int id);

  void addStudent(StudentDto studentDto);

  List<Student> getAllStudents();
}
