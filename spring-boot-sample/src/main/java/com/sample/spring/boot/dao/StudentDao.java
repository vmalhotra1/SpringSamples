package com.sample.spring.boot.dao;

import com.sample.spring.boot.model.Student;

/**
 * @author Vaibhav Malhotra
 * @since 22 Aug, 2019
 */
public interface StudentDao {
  Student getStudentById(int id);
}
