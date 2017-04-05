package com.iss.exchange.core.pay.dto;

import com.iss.exchange.core.base.dto.BaseDTO;
import com.iss.exchange.core.pay.entity.ExPaySingleInstructionOut;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ExPaySingleInstructionOutDTO extends ExPaySingleInstructionOut implements BaseDTO{
	@ApiModelProperty("本方银行编号描述")
	private String exBankTypeDesc;
	@ApiModelProperty("组织机构代码描述")
	private String exAgencyDesc;
	@ApiModelProperty("执行结果返回码描述")
	private String exIretDesc;


}