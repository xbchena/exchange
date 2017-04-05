package com.iss.exchange.core.channel.dto;

import com.iss.exchange.core.base.dto.BaseDTO;
import com.iss.exchange.core.channel.entity.ExChannel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ExChannelDTO extends ExChannel implements BaseDTO{
	@ApiModelProperty("通道编号描述")
	private String exChannelDesc;
	@ApiModelProperty("通道类型：比如1银行、2第三方支付描述")
	private String exChannelTypeDesc;


}