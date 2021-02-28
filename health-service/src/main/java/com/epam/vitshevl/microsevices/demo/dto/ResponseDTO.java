package com.epam.vitshevl.microsevices.demo.dto;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * ResponseDTO.
 *
 * @author Viktor_Shevliagin
 */

@Data
@Accessors(chain = true)
public class ResponseDTO {
  private Integer version;
}
