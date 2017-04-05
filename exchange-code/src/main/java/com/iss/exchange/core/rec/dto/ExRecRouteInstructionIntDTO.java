package com.iss.exchange.core.rec.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import com.iss.exchange.core.base.dto.BaseDTO;
import com.iss.exchange.core.rec.entity.ExRecRouteInstructionInt;

@Data
public class ExRecRouteInstructionIntDTO extends ExRecRouteInstructionInt implements BaseDTO{
	@ApiModelProperty("组织机构代码描述")
	private String exAgencyDesc;


}