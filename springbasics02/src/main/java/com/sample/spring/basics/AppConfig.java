package com.sample.spring.basics;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Vaibhav Malhotra
 * @since 21 Aug, 2019
 */
@Configuration
@ComponentScan("com.sample.spring.basics")
public class AppConfig {

  @Bean
  public HelloWorld helloWorld() {
    HelloWorld helloBean = new HelloWorld();
    helloBean.setMessage("Hello World");
    return helloBean;
  }

  @Bean
  public HelloWorld helloWorld1() {
    HelloWorld helloBean = new HelloWorld();
    helloBean.setMessage("Hello World - 111");
    return helloBean;
  }
}
