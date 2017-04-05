package com.iss.exchange.core.pay.dto;

import com.iss.exchange.core.base.dto.BaseDTO;
import com.iss.exchange.core.pay.entity.ExRecBatchInstructionIntDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ExRecBatchInstructionIntDetailDTO extends ExRecBatchInstructionIntDetail implements BaseDTO{
	@ApiModelProperty("付方联行号描述")
	private String exPayBranchUniteDesc;


}