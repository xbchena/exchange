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

@ApiModel("")
@Data
public class ExPayBatchInstructionIntDetail extends BaseEntity{
	@ApiModelProperty("")
	private BigInteger exPayBatchInstructionIntDetailId;	//
	@ApiModelProperty("")
	private BigInteger exPayBatchInstructionInId;	//
	@ApiModelProperty("收款账号")
	private String exRecAccountNo;	//收款账号
	@ApiModelProperty("收方户名")
	private String exRecAccountName;	//收方户名
	@ApiModelProperty("收方开户银行")
	private String exRecBranchName;	//收方开户银行
	@ApiModelProperty("收方银行类型、ICBC–工行、BOC–中行、ABC–农行、BOCC–交行、CHINAPAY–招行、CCB–建行、")
	private String exRecBranchType;	//收方银行类型、ICBC–工行、BOC–中行、ABC–农行、BOCC–交行、CHINAPAY–招行、CCB–建行、
	@ApiModelProperty("收方人行号")
	private String exRecBankCnaps;	//收方人行号
	@ApiModelProperty("收方城市")
	private String exRecCityName;	//收方城市
	@ApiModelProperty("收方省份")
	private String exRecProviceName;	//收方省份
	@ApiModelProperty("收方联行号")
	private String exRecBranchUniteCode;	//收方联行号
	@ApiModelProperty("收方卡折标示、1-借记卡、2-信用卡、3-存折、")
	private String exRecCardFlag;	//收方卡折标示、1-借记卡、2-信用卡、3-存折、
	@ApiModelProperty("收方联系电话")
	private String exRecContPhone;	//收方联系电话
	@ApiModelProperty("序号,固定1")
	private String exOrderId;	//序号,固定1
	@ApiModelProperty("业务序列号")
	private String exOrderNo;	//业务序列号
	@ApiModelProperty("发往银行记账流水")
	private String exOrderBankNo;	//发往银行记账流水
	@ApiModelProperty("处理速度、1：加急；2普通")
	private String exPayType;	//处理速度、1：加急；2普通
	@ApiModelProperty("交易金额格式：0.00")
	private String exPayAmt;	//交易金额格式：0.00
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