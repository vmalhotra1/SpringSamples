package com.sample.spring.boot.controller;

import com.sample.spring.boot.model.Student;
import com.sample.spring.boot.model.StudentDto;
import com.sample.spring.boot.service.StudentService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Vaibhav Malhotra
 * @since 21 Aug, 2019
 */
@RestController
@RequestMapping("/students")
public class StudentController {

  private StudentService studentService;

  public StudentController(StudentService studentService) {
    this.studentService = studentService;
  }

  @GetMapping
  public List<Student> version() {
    return studentService.getAllStudents();
  }

  @GetMapping("/{id}")
  public Student getStudent(@PathVariable("id") int id) {
    return studentService.getStudentById(id);
  }

  @PostMapping
  public void addStudent(@RequestBody StudentDto studentDto) {
    studentService.addStudent(studentDto);
  }
}
