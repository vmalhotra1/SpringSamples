package com.sample.spring.annotations;

import com.sample.spring.annotations.config.AppConfig;
import com.sample.spring.model.Car;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Vaibhav Malhotra
 * @since 20 Aug, 2019
 */
public class MainAnnotationsApp {

  public static void main(String[] args) {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

    Car amaze = (Car) applicationContext.getBean("amaze");
    System.out.println("amaze created : " + amaze);
  }
}
