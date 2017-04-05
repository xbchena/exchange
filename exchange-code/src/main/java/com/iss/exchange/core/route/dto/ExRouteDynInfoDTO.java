package com.iss.exchange.core.route.dto;

import com.iss.exchange.core.base.dto.BaseDTO;
import com.iss.exchange.core.route.entity.ExRouteDynInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ExRouteDynInfoDTO extends ExRouteDynInfo implements BaseDTO{
	@ApiModelProperty("通道编号描述")
	private String exChannelDesc;
	@ApiModelProperty("机构编码描述")
	private String exAgencyDesc;


}