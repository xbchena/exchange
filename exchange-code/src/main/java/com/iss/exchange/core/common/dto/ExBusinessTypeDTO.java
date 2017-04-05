package com.iss.exchange.core.common.dto;

import com.iss.exchange.core.base.dto.BaseDTO;
import com.iss.exchange.core.common.entity.ExBusinessType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ExBusinessTypeDTO extends ExBusinessType implements BaseDTO{
	@ApiModelProperty("描述")
	private String exBusinessTypeDesc;


}