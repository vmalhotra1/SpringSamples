package com.sample.spring.boot.dao;

import com.sample.spring.boot.model.Student;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 * @author Vaibhav Malhotra
 * @since 22 Aug, 2019
 */
@Component
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
