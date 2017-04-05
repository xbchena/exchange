package com.iss.exchange.core.pay.dto;

import com.iss.exchange.core.base.dto.BaseDTO;
import com.iss.exchange.core.pay.entity.ExPayRouteInstructionIntDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ExPayRouteInstructionIntDetailDTO extends ExPayRouteInstructionIntDetail implements BaseDTO{
	@ApiModelProperty("收方联行号描述")
	private String exRecBranchUniteDesc;


}