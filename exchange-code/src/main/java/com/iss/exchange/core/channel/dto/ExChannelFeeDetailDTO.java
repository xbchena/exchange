package com.iss.exchange.core.channel.dto;

import com.iss.exchange.core.base.dto.BaseDTO;
import com.iss.exchange.core.channel.entity.ExChannelFeeDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ExChannelFeeDetailDTO extends ExChannelFeeDetail implements BaseDTO{
	@ApiModelProperty("计费代码描述")
	private String exChannelFeeDesc;


}