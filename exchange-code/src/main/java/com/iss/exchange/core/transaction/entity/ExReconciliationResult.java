package com.iss.exchange.core.transaction.entity;

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

@ApiModel("对账结果表")
@Data
public class ExReconciliationResult extends BaseEntity{
	@ApiModelProperty("")
	private BigInteger exReconciliationResultId;	//
	@ApiModelProperty("最后修改时间")
	private Date lastModifiTime;	//最后修改时间


}