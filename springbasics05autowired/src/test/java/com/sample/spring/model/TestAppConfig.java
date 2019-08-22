package com.sample.spring.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Vaibhav Malhotra
 * @since 21 Aug, 2019
 */
@Configuration
@ComponentScan("com.sample.spring")
public class TestAppConfig {

  @Bean
  public Engine engine() {
    return new Engine("diesel", 5);
  }

  @Bean
  public Transmission transmission() {
    return new Transmission("automatic");
  }
}
