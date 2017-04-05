package com.iss.exchange.core.rec.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import com.iss.exchange.core.base.dto.BaseDTO;
import com.iss.exchange.core.rec.entity.ExRecRouteInstrucrionOutDetail;

@Data
public class ExRecRouteInstrucrionOutDetailDTO extends ExRecRouteInstrucrionOutDetail implements BaseDTO{
	@ApiModelProperty("执行结果返回码描述")
	private String exIretDesc;


}