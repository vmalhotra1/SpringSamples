package com.sample.spring.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Vaibhav Malhotra
 * @since 20 Aug, 2019
 */
public class MainApp {

  public static void main(String[] args) {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

    HelloWorld bean = (HelloWorld) applicationContext.getBean("helloWorld1");
    System.out.println(bean.getMessage());
  }
}
