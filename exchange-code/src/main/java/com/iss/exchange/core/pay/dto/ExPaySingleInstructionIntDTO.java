package com.iss.exchange.core.pay.dto;

import com.iss.exchange.core.base.dto.BaseDTO;
import com.iss.exchange.core.pay.entity.ExPaySingleInstructionInt;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ExPaySingleInstructionIntDTO extends ExPaySingleInstructionInt implements BaseDTO{
	@ApiModelProperty("组织机构代码描述")
	private String exAgencyDesc;
	@ApiModelProperty("收方联行号描述")
	private String exRecBranchUniteDesc;


}