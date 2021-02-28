package com.epam.vitshevl.microsevices.demo.integration;

import com.epam.vitshevl.microsevices.demo.integration.dto.HeathServiceDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * HealthServiceClient.
 *
 * @author Viktor_Shevliagin
 */
@RequestMapping(value = "/health")
@FeignClient(name= "health-service", url = "health-service:8080")
public interface HealthServiceClient {

  @GetMapping
  HeathServiceDTO invoke();

}
