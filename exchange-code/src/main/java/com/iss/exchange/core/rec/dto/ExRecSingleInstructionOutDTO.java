package com.iss.exchange.core.rec.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import com.iss.exchange.core.base.dto.BaseDTO;
import com.iss.exchange.core.rec.entity.ExRecSingleInstructionOut;

@Data
public class ExRecSingleInstructionOutDTO extends ExRecSingleInstructionOut implements BaseDTO{
	@ApiModelProperty("本方银行编号描述")
	private String exBankTypeDesc;
	@ApiModelProperty("组织机构代码描述")
	private String exAgencyDesc;
	@ApiModelProperty("执行结果返回码描述")
	private String exIretDesc;


}