package com.iss.exchange.core.pay.dto;

import com.iss.exchange.core.base.dto.BaseDTO;
import com.iss.exchange.core.pay.entity.ExPayBatchInstructionOut;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ExPayBatchInstructionOutDTO extends ExPayBatchInstructionOut implements BaseDTO{
	@ApiModelProperty("本方银行编号描述")
	private String exBankTypeDesc;
	@ApiModelProperty("组织机构代码描述")
	private String exAgencyDesc;


}