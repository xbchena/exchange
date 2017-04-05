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

@ApiModel("银行/第三方编号表")
@Data
public class ExBankType extends BaseEntity{
	@ApiModelProperty("银行类型编号")
	private String exBankTypeCode;	//银行类型编号
	@ApiModelProperty("银类型名称")
	private String exBankTypeName;	//银类型名称
	@ApiModelProperty("最后修改时间")
	private Date lastModifiTime;	//最后修改时间


}