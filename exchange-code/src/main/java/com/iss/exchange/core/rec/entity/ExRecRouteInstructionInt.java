package com.iss.exchange.core.rec.entity;

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

@ApiModel("智能收款信息表")
@Data
public class ExRecRouteInstructionInt extends BaseEntity{
	@ApiModelProperty("")
	private BigInteger exRecRouteInstructionInId;	//
	@ApiModelProperty("版本号")
	private String exVersion;	//版本号
	@ApiModelProperty("")
	private String exTxTime;	//
	@ApiModelProperty("组织机构代码")
	private String exAgencyCode;	//组织机构代码
	@ApiModelProperty("组织机构名称")
	private String exAgencyName;	//组织机构名称
	@ApiModelProperty("接入用户")
	private String exLoginId;	//接入用户
	@ApiModelProperty("用户密码")
	private String exLoginPwd;	//用户密码
	@ApiModelProperty("请求序列号")
	private String exTxPackNo;	//请求序列号
	@ApiModelProperty("最后修改时间")
	private Date lastModifiTime;	//最后修改时间


}