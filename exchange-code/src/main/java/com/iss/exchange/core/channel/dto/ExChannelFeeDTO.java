package com.iss.exchange.core.channel.dto;

import com.iss.exchange.core.base.dto.BaseDTO;
import com.iss.exchange.core.channel.entity.ExChannelFee;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ExChannelFeeDTO extends ExChannelFee implements BaseDTO{
	@ApiModelProperty("计费代码描述")
	private String exChannelFeeDesc;
	@ApiModelProperty("机构编码描述")
	private String exAgencyDesc;
	@ApiModelProperty("通道ID描述")
	private String exChannelDesc;


}