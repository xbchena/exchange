package com.iss.exchange.core.rec.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import com.iss.exchange.core.base.dto.BaseDTO;
import com.iss.exchange.core.rec.entity.ExRecRouteInstructionIntDetail;

@Data
public class ExRecRouteInstructionIntDetailDTO extends ExRecRouteInstructionIntDetail implements BaseDTO{
	@ApiModelProperty("付方联行号描述")
	private String exPayBranchUniteDesc;


}