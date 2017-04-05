package com.iss.exchange.core.route.dto;

import com.iss.exchange.core.base.dto.BaseDTO;
import com.iss.exchange.core.route.entity.ExRouteStaticInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ExRouteStaticInfoDTO extends ExRouteStaticInfo implements BaseDTO{
	@ApiModelProperty("机构编码描述")
	private String exAgencyDesc;


}