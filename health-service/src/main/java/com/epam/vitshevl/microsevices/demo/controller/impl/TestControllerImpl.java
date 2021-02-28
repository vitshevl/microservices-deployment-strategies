package com.epam.vitshevl.microsevices.demo.controller.impl;


import com.epam.vitshevl.microsevices.demo.dto.ResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
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
@RequiredArgsConstructor
@RequestMapping("/health")
public class TestControllerImpl {

  @Value("${test-properties.version}")
  private Integer version;

  @GetMapping
  public ResponseEntity<ResponseDTO> healthCheck() {
    var responseDto = new ResponseDTO();
    responseDto.setVersion(version);
    return ResponseEntity.ok(responseDto);
  }

}
