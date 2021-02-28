package com.epam.vitshevl.microsevices.demo.dto;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * ProxyServiceResponseDTO.
 *
 * @author Viktor_Shevliagin
 */

@Data
@Accessors(chain = true)
public class ProxyServiceResponseDTO {
  private Integer version;
  private Integer responseCode;
}
