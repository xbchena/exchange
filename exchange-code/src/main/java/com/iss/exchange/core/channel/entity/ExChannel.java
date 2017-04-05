package com.iss.exchange.core.channel.entity;

import java.util.Date;
import com.iss.exchange.core.base.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.lang.Long;
import java.lang.Short;
import java.lang.Integer;
import java.math.BigInteger;
import java.lang.Double;
import java.lang.Byte;
import java.math.BigDecimal;
import lombok.Data;

@ApiModel("基础数据-处理通道")
@Data
public class ExChannel extends BaseEntity{
	@ApiModelProperty("通道编号")
	private String exChannelCode;	//通道编号
	@ApiModelProperty("通道类型：比如1银行、2第三方支付")
	private String exChannelTypeCode;	//通道类型：比如1银行、2第三方支付
	@ApiModelProperty("通道名称")
	private String exChannelName;	//通道名称
	@ApiModelProperty("最后修改时间")
	private Date lastModifiTime;	//最后修改时间


}