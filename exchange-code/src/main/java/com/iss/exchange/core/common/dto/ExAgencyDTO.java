package com.iss.exchange.core.common.dto;

import com.iss.exchange.core.base.dto.BaseDTO;
import com.iss.exchange.core.common.entity.ExAgency;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ExAgencyDTO extends ExAgency implements BaseDTO{
	@ApiModelProperty("机构编码描述")
	private String exAgencyDesc;


}