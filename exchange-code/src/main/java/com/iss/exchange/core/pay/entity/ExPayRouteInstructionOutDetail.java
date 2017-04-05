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

@ApiModel("智能路由付款指令详细状态信息")
@Data
public class ExPayRouteInstructionOutDetail extends BaseEntity{
	@ApiModelProperty("")
	private BigInteger exPayRouteInstrucrionOutDetailId;	//
	@ApiModelProperty("")
	private BigInteger exPayRouteInstructionIntDetailId;	//
	@ApiModelProperty("")
	private BigInteger exPayRouteInstrutctionOutId;	//
	@ApiModelProperty("序号,固定1")
	private String exOrderId;	//序号,固定1
	@ApiModelProperty("业务序列号")
	private String exOrderNo;	//业务序列号
	@ApiModelProperty("发往银行记账流水")
	private String exOrderBankNo;	//发往银行记账流水
	@ApiModelProperty("交易状态、1–交易成功、2–交易失败、3–交易处理中、4–交易未知")
	private Short exBankStatus;	//交易状态、1–交易成功、2–交易失败、3–交易处理中、4–交易未知
	@ApiModelProperty("执行结果返回码")
	private String exIretCode;	//执行结果返回码
	@ApiModelProperty("执行结果返回描述")
	private String exIretMessage;	//执行结果返回描述
	@ApiModelProperty("最后修改时间")
	private Date lastModifiTime;	//最后修改时间


}