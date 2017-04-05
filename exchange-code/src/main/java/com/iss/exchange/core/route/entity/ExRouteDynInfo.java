package com.iss.exchange.core.route.entity;

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

@ApiModel("自动匹配路由规则")
@Data
public class ExRouteDynInfo extends BaseEntity{
	@ApiModelProperty("id")
	private BigInteger exRouteInfoId;	//id
	@ApiModelProperty("通道编号")
	private String exChannelCode;	//通道编号
	@ApiModelProperty("机构编码")
	private String exAgencyCode;	//机构编码
	@ApiModelProperty("产品类型（0-全部1-付款2-扣款）")
	private Short productType;	//产品类型（0-全部1-付款2-扣款）
	@ApiModelProperty("对方账户类型（0-全部账户1-对私2-对公）")
	private Integer oppAccountType;	//对方账户类型（0-全部账户1-对私2-对公）
	@ApiModelProperty("时效性（结算周期）0-实时1-准实时2-T+1")
	private Short settleType;	//时效性（结算周期）0-实时1-准实时2-T+1
	@ApiModelProperty("接口类型（0-全部1-单笔2-批量）")
	private Short interfaceType;	//接口类型（0-全部1-单笔2-批量）
	@ApiModelProperty("记录状态（0-启动1-注销/停用2-新增待审核3-编辑待审核）")
	private Integer recordStatus;	//记录状态（0-启动1-注销/停用2-新增待审核3-编辑待审核）
	@ApiModelProperty("最后修改时间")
	private Date lastModifiTime;	//最后修改时间


}