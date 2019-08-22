package com.sample.spring.config;

import com.sample.spring.model.Engine;
import com.sample.spring.model.Transmission;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author
 * @since 21 Aug, 2019Vaibhav Malhotra
 */
@Configuration
@ComponentScan("com.sample.spring")
public class AppConfig {

  @Bean
  public Engine engine() {
    return new Engine("petrol", 5);
  }

  @Bean
  public Transmission transmission() {
    return new Transmission("automatic");
  }
}
