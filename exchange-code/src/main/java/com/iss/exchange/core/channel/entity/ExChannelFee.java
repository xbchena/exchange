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

@ApiModel("通道计费信息维护")
@Data
public class ExChannelFee extends BaseEntity{
	@ApiModelProperty("计费代码")
	private String exChannelFeeCode;	//计费代码
	@ApiModelProperty("机构编码")
	private String exAgencyCode;	//机构编码
	@ApiModelProperty("通道ID")
	private String exChannelCode;	//通道ID
	@ApiModelProperty("计费名称")
	private String exChannelFeeName;	//计费名称
	@ApiModelProperty("记录状态（0-启动1-注销/停用2-新增待审核3-编辑待审核）")
	private Integer recordStatus;	//记录状态（0-启动1-注销/停用2-新增待审核3-编辑待审核）
	@ApiModelProperty("最后修改时间")
	private Date lastModifiTime;	//最后修改时间


}