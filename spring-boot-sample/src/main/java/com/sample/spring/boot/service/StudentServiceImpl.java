package com.sample.spring.boot.service;

import com.sample.spring.boot.dao.StudentRepository;
import com.sample.spring.boot.model.Student;
import com.sample.spring.boot.model.StudentDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Vaibhav Malhotra
 * @since 22 Aug, 2019
 */
@Service
public class StudentServiceImpl implements StudentService {

  @Autowired
  private StudentRepository studentDao;

  @Override
  public Student getStudentById(int id) {
    return studentDao.findById(id).orElse(new Student(-1, "NA"));
  }

  @Override
  public void addStudent(StudentDto studentDto) {
    Student student = new Student();
    student.setName(studentDto.getName());

    studentDao.save(student);
  }

  @Override
  public List<Student> getAllStudents() {
    return (List<Student>) studentDao.findAll();
  }
}
