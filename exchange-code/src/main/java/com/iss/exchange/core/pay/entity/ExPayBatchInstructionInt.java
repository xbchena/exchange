package com.iss.exchange.core.pay.entity;

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

@ApiModel("批量付款原始交易表")
@Data
public class ExPayBatchInstructionInt extends BaseEntity{
	@ApiModelProperty("")
	private BigInteger exPayBatchInstructionInId;	//
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
	@ApiModelProperty("付款账号")
	private String exPayAccountNo;	//付款账号
	@ApiModelProperty("付款名称")
	private String exPayAccountName;	//付款名称
	@ApiModelProperty("付款银行名称")
	private String exPayBranchName;	//付款银行名称
	@ApiModelProperty("渠道类型、ICBC:、ABC、BOC、CCB")
	private String exPayBranchType;	//渠道类型、ICBC:、ABC、BOC、CCB
	@ApiModelProperty("付方省份")
	private String exPayProviceName;	//付方省份
	@ApiModelProperty("付方城市")
	private String exPayCityName;	//付方城市
	@ApiModelProperty("最后修改时间")
	private Date lastModifiTime;	//最后修改时间


}