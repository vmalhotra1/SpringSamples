package com.sample.spring.xml;

import com.sample.spring.model.Car;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Vaibhav Malhotra
 * @since 20 Aug, 2019
 */
public class MainXmlApp {

  public static void main(String[] args) {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");

    Car amaze = (Car) applicationContext.getBean("amaze");
    System.out.println("amaze created : " + amaze);
  }
}
