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

@ApiModel("接入平台的用户注册表")
@Data
public class ExAgency extends BaseEntity{
	@ApiModelProperty("机构编码")
	private String exAgencyCode;	//机构编码
	@ApiModelProperty("机构英文名称")
	private String exAgencyName;	//机构英文名称
	@ApiModelProperty("上级机构编码")
	private String exParentAgencyId;	//上级机构编码
	@ApiModelProperty("最后修改时间")
	private Date lastModifiTime;	//最后修改时间


}