package com.autodesk.spring.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Vaibhav Malhotra
 * @since 20 Aug, 2019
 */
public class MainApp {

  public static void main(String[] args) {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");

    HelloWorld bean = (HelloWorld) applicationContext.getBean("helloWorld");
    System.out.println(bean.getMessage());
  }
}
