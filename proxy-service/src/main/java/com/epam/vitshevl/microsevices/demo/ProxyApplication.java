package com.epam.vitshevl.microsevices.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * ProxyApplication.
 *
 * @author Viktor_Shevliagin
 */

@SpringBootApplication
@EnableFeignClients
public class ProxyApplication {

  public static void main(String[] args) {
    SpringApplication.run(ProxyApplication.class, args);
  }

}
