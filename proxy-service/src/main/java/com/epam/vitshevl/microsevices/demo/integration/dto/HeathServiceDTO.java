package com.epam.vitshevl.microsevices.demo.integration.dto;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * HeathServiceDTO.
 *
 * @author Viktor_Shevliagin
 */
@Data
@Accessors(chain = true)
public class HeathServiceDTO {
  private Integer version;
}
