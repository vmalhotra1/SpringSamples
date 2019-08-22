package com.sample.spring.boot.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author Vaibhav Malhotra
 * @since 22 Aug, 2019
 */
@Aspect
@Component
public class StudentAspect {

  @Before("execution(* com.sample.spring.boot.service.StudentServiceImpl.*(..))")
  public void before(JoinPoint joinPoint) {
    System.out.println("about to execute: " + joinPoint);
  }
}
