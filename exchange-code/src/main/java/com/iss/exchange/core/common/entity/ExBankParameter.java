package com.iss.exchange.core.common.entity;

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

@ApiModel("银行或者是第三方业务参数表")
@Data
public class ExBankParameter extends BaseEntity{
	@ApiModelProperty("")
	private BigInteger exBankParameterId;	//
	@ApiModelProperty("")
	private String exAgencyCode;	//
	@ApiModelProperty("银行类型编号")
	private String exBankTypeCode;	//银行类型编号
	@ApiModelProperty("")
	private String exBusinessTypeCode;	//
	@ApiModelProperty("")
	private String exBankParameter1;	//
	@ApiModelProperty("")
	private String exBankParameter2;	//
	@ApiModelProperty("")
	private String exBankParameter3;	//
	@ApiModelProperty("")
	private String exBankParameter4;	//
	@ApiModelProperty("")
	private String exBankParameter5;	//
	@ApiModelProperty("最后修改时间")
	private Date lastModifiTime;	//最后修改时间


}