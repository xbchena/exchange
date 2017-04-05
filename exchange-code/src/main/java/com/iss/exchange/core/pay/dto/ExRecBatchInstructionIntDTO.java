package com.iss.exchange.core.pay.dto;

import com.iss.exchange.core.base.dto.BaseDTO;
import com.iss.exchange.core.pay.entity.ExRecBatchInstructionInt;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ExRecBatchInstructionIntDTO extends ExRecBatchInstructionInt implements BaseDTO{
	@ApiModelProperty("组织机构代码描述")
	private String exAgencyDesc;


}