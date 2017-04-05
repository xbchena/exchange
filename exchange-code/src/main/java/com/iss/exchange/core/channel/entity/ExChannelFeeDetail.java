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

@ApiModel("通道计费信息维护-明细")
@Data
public class ExChannelFeeDetail extends BaseEntity{
	@ApiModelProperty("费项明细id")
	private BigInteger uppChannelFeeDetailId;	//费项明细id
	@ApiModelProperty("计费代码")
	private String exChannelFeeCode;	//计费代码
	@ApiModelProperty("卡种（0-全部1-本行卡2-他行卡）")
	private Short cardType;	//卡种（0-全部1-本行卡2-他行卡）
	@ApiModelProperty("是否同城(0-异地1-同城)")
	private Short isSameCity;	//是否同城(0-异地1-同城)
	@ApiModelProperty("交易金额（起）")
	private BigDecimal amountStart;	//交易金额（起）
	@ApiModelProperty("交易金额（终）")
	private BigDecimal amountEnd;	//交易金额（终）
	@ApiModelProperty("计费类型（0-手续费1-汇划费）")
	private Short feeType;	//计费类型（0-手续费1-汇划费）
	@ApiModelProperty("收费计算方式（0-按笔收费1-按比例%收费）")
	private Short caculateType;	//收费计算方式（0-按笔收费1-按比例%收费）
	@ApiModelProperty("费用")
	private BigDecimal feeAmount;	//费用
	@ApiModelProperty("按比最低收费")
	private BigDecimal minBypercent;	//按比最低收费
	@ApiModelProperty("按比最高收费")
	private BigDecimal maxBypercent;	//按比最高收费
	@ApiModelProperty("是否支持加急（0-否1-是）")
	private Short urgSupport;	//是否支持加急（0-否1-是）
	@ApiModelProperty("加急加收费率")
	private BigDecimal urgFeeRate;	//加急加收费率
	@ApiModelProperty("加急费用封顶")
	private BigDecimal urgFeeMax;	//加急费用封顶
	@ApiModelProperty("最后修改时间")
	private Date lastModifiTime;	//最后修改时间


}