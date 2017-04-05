package com.iss.exchange.core.rec.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import com.iss.exchange.core.base.dto.BaseDTO;
import com.iss.exchange.core.rec.entity.ExRecRouteInstructionOut;

@Data
public class ExRecRouteInstructionOutDTO extends ExRecRouteInstructionOut implements BaseDTO{
	@ApiModelProperty("本方银行编号描述")
	private String exBankTypeDesc;
	@ApiModelProperty("组织机构代码描述")
	private String exAgencyDesc;


}