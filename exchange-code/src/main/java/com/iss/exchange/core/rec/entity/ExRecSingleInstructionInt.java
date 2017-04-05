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

@ApiModel("单笔收款交易原始数据表")
@Data
public class ExRecSingleInstructionInt extends BaseEntity{
	@ApiModelProperty("")
	private BigInteger exRecSingleInstructionInId;	//
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
	@ApiModelProperty("序号,固定1")
	private String exOrderId;	//序号,固定1
	@ApiModelProperty("业务序列号")
	private String exOrderNo;	//业务序列号
	@ApiModelProperty("发往银行记账流水")
	private String exOrderBankNo;	//发往银行记账流水
	@ApiModelProperty("")
	private String exRecAccountNo;	//
	@ApiModelProperty("")
	private String exRecAccountName;	//
	@ApiModelProperty("")
	private String exRecBranchName;	//
	@ApiModelProperty("渠道类型、ICBC:、ABC、BOC、CCB")
	private String exRecBranchType;	//渠道类型、ICBC:、ABC、BOC、CCB
	@ApiModelProperty("")
	private String exRecProviceName;	//
	@ApiModelProperty("")
	private String exRecCityName;	//
	@ApiModelProperty("")
	private String exPayAccountNo;	//
	@ApiModelProperty("")
	private String exPayAccountName;	//
	@ApiModelProperty("")
	private String exPayBranchName;	//
	@ApiModelProperty("")
	private String exPayBranchType;	//
	@ApiModelProperty("")
	private String exPayBankCnaps;	//
	@ApiModelProperty("")
	private String exPayProviceName;	//
	@ApiModelProperty("")
	private String exPayCityName;	//
	@ApiModelProperty("")
	private String exPayBranchUniteCode;	//
	@ApiModelProperty("")
	private String exPayCardFlag;	//
	@ApiModelProperty("")
	private String exPayContPhone;	//
	@ApiModelProperty("处理速度、1：加急；2普通")
	private String exRecType;	//处理速度、1：加急；2普通
	@ApiModelProperty("交易金额格式：0.00")
	private String exRecAmt;	//交易金额格式：0.00
	@ApiModelProperty("交易币种RMB")
	private String exCurrType;	//交易币种RMB
	@ApiModelProperty("是否同行、0：同行，1跨行")
	private String exSysIoFlg;	//是否同行、0：同行，1跨行
	@ApiModelProperty("是否同城0：否；1：是")
	private String exIsSameCity;	//是否同城0：否；1：是
	@ApiModelProperty("对公对私标示、0：对私；1对公")
	private String exProp;	//对公对私标示、0：对私；1对公
	@ApiModelProperty("对私业务类型、当Prop为对私付款时、10001–保险、10002–工资、10003–报销、10004–奖金、10005--后续补充、10006、10007、10008、10009、10010、")
	private String exPayBusType;	//对私业务类型、当Prop为对私付款时、10001–保险、10002–工资、10003–报销、10004–奖金、10005--后续补充、10006、10007、10008、10009、10010、
	@ApiModelProperty("摘要")
	private String exSummary;	//摘要
	@ApiModelProperty("附言")
	private String exPostScript;	//附言
	@ApiModelProperty("备用1")
	private String exReqResvered1;	//备用1
	@ApiModelProperty("备用2")
	private String exReqResvered2;	//备用2
	@ApiModelProperty("最后修改时间")
	private Date lastModifiTime;	//最后修改时间


}