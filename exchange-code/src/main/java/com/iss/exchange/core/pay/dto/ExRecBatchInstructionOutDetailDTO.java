package com.iss.exchange.core.pay.dto;

import com.iss.exchange.core.base.dto.BaseDTO;
import com.iss.exchange.core.pay.entity.ExRecBatchInstructionOutDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ExRecBatchInstructionOutDetailDTO extends ExRecBatchInstructionOutDetail implements BaseDTO{
	@ApiModelProperty("执行结果返回码描述")
	private String exIretDesc;


}