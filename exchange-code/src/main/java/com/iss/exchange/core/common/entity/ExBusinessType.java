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

@ApiModel("渠道对私参数类型")
@Data
public class ExBusinessType extends BaseEntity{
	@ApiModelProperty("")
	private String exBusinessTypeCode;	//
	@ApiModelProperty("")
	private String exBusinessTypeName;	//
	@ApiModelProperty("最后修改时间")
	private Date lastModifiTime;	//最后修改时间


}