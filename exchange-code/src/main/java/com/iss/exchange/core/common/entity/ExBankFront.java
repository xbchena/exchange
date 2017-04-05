package com.iss.exchange.core.common.entity;

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

@ApiModel("银行前置")
@Data
public class ExBankFront extends BaseEntity{
	@ApiModelProperty("")
	private BigInteger exBankFrontId;	//
	@ApiModelProperty("机构编码")
	private String exAgencyCode;	//机构编码
	@ApiModelProperty("银行类型编号")
	private String exBankTypeCode;	//银行类型编号


}