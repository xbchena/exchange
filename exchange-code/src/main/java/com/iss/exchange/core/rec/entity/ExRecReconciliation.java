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

@ApiModel("收款对账单")
@Data
public class ExRecReconciliation extends BaseEntity{
	@ApiModelProperty("")
	private BigInteger exRecReconciliationId;	//
	@ApiModelProperty("最后修改时间")
	private Date lastModifiTime;	//最后修改时间


}