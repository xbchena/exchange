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

@ApiModel("银行请求流水号规则")
@Data
public class ExBankSerialRule extends BaseEntity{
	@ApiModelProperty("")
	private BigInteger exBankSerialRuleId;	//
	@ApiModelProperty("机构编码")
	private String exAgencyCode;	//机构编码
	@ApiModelProperty("银行类型编号")
	private String exBankTypeCode;	//银行类型编号
	@ApiModelProperty("请求序列号长度")
	private BigInteger exPackageLength;	//请求序列号长度
	@ApiModelProperty("请求序列号头部")
	private String exPackageHead;	//请求序列号头部
	@ApiModelProperty("请求序列号身体")
	private String exPackageBody;	//请求序列号身体
	@ApiModelProperty("最后修改时间")
	private Date lastModifiTime;	//最后修改时间


}