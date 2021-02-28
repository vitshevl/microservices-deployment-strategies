package com.epam.vitshevl.microsevices.demo.controller.impl;


import com.epam.vitshevl.microsevices.demo.dto.ProxyServiceResponseDTO;
import com.epam.vitshevl.microsevices.demo.integration.HealthServiceClient;
import com.epam.vitshevl.microsevices.demo.integration.dto.HeathServiceDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestControllerImpl.
 *
 * @author Viktor_Shevliagin
 */

@RestController
@RequestMapping("/check")
@AllArgsConstructor
public class TestControllerImpl {

  private HealthServiceClient healthServiceClient;

  @GetMapping
  public ResponseEntity<ProxyServiceResponseDTO> check() {

    ProxyServiceResponseDTO responseDto = new ProxyServiceResponseDTO();

    try {
      HeathServiceDTO healthServiceResponse = healthServiceClient.invoke();
      responseDto.setResponseCode(200);
      responseDto.setVersion(healthServiceResponse.getVersion());
    }catch (Exception e){
      e.printStackTrace();
      responseDto.setResponseCode(500);
      responseDto.setVersion(-1);
    }
    return ResponseEntity.ok(responseDto);
  }

}
