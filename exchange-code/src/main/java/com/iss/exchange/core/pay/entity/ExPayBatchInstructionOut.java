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

@ApiModel("批量付款状态表")
@Data
public class ExPayBatchInstructionOut extends BaseEntity{
	@ApiModelProperty("")
	private BigInteger exPayBatchInstrutctionOutId;	//
	@ApiModelProperty("")
	private BigInteger exPayBatchInstructionInId;	//
	@ApiModelProperty("本方银行编号")
	private String exBankTypeCode;	//本方银行编号
	@ApiModelProperty("组织机构代码")
	private String exAgencyCode;	//组织机构代码
	@ApiModelProperty("请求序列号")
	private String exTxPackNo;	//请求序列号
	@ApiModelProperty("通道发往银行的请求流水")
	private String exBankSequence;	//通道发往银行的请求流水
	@ApiModelProperty("批次状态;、1:整批状态完结、2:状态未完结")
	private Short exBatchStatus;	//批次状态;、1:整批状态完结、2:状态未完结
	@ApiModelProperty("最后修改时间")
	private Date lastModifiTime;	//最后修改时间


}