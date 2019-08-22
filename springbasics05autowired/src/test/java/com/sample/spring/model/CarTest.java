package com.sample.spring.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

/**
 * @author Vaibhav Malhotra
 * @since 21 Aug, 2019
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestAppConfig.class, loader = AnnotationConfigContextLoader.class)
public class CarTest {

  @Autowired
  private Engine engine;

  @Autowired
  private Transmission transmission;

  @Test
  public void testDieselCar() {
    // xyz
  }

}
