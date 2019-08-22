package com.sample.spring.annotations.config;

import com.sample.spring.model.Car;
import com.sample.spring.model.Engine;
import com.sample.spring.model.Transmission;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Vaibhav Malhotra
 * @since 21 Aug, 2019
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

  @Bean
  public Car amaze() {
    // todo - audience please fix me
    Car car = new Car(engine());
    //car.setTransmission(transmission());
    return car;
  }
}
