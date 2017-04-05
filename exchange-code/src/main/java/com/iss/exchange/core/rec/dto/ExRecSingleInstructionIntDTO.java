package com.iss.exchange.core.rec.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import com.iss.exchange.core.base.dto.BaseDTO;
import com.iss.exchange.core.rec.entity.ExRecSingleInstructionInt;

@Data
public class ExRecSingleInstructionIntDTO extends ExRecSingleInstructionInt implements BaseDTO{
	@ApiModelProperty("组织机构代码描述")
	private String exAgencyDesc;
	@ApiModelProperty("描述")
	private String exPayBranchUniteDesc;


}