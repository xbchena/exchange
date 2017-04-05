package com.iss.exchange.core.channel.entity;

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

@ApiModel("通道业务能力设置")
@Data
public class ExChannelAbility extends BaseEntity{
	@ApiModelProperty("通道公司业务处理能力id")
	private BigInteger exChannelAbilityId;	//通道公司业务处理能力id
	@ApiModelProperty("机构编码")
	private String exAgencyCode;	//机构编码
	@ApiModelProperty("通道编号")
	private String exChannelCode;	//通道编号
	@ApiModelProperty("产品类型（0-全部1-付款2-扣款）")
	private Short productType;	//产品类型（0-全部1-付款2-扣款）
	@ApiModelProperty("对方账户类型（0-全部账户1-对私2-对公）")
	private BigInteger exOppAccountType;	//对方账户类型（0-全部账户1-对私2-对公）
	@ApiModelProperty("类型编码、BOC-中国银行、ABC-农业银行、ICBC-工商银行、CCB-建设银行、CMB-招商银行、SPDB-浦发银行、CEB-光大银行、PAB-平安银行、CIB-兴业银行、CMBC-民生银行、CGB-广发银行")
	private String exOppBankTypeCode;	//类型编码、BOC-中国银行、ABC-农业银行、ICBC-工商银行、CCB-建设银行、CMB-招商银行、SPDB-浦发银行、CEB-光大银行、PAB-平安银行、CIB-兴业银行、CMBC-民生银行、CGB-广发银行
	@ApiModelProperty("接口类型（0-全部1-单笔2-批量）")
	private BigInteger interfaceType;	//接口类型（0-全部1-单笔2-批量）
	@ApiModelProperty("每笔最大限额")
	private BigDecimal maxamtEachTrans;	//每笔最大限额
	@ApiModelProperty("每日最大限额")
	private BigDecimal maxamtEachDay;	//每日最大限额
	@ApiModelProperty("交易受理窗口类型（0-全天(含节假日和休息日)1-全天(不含节假日和休息日)2-自定义每日受理时间（含节假日和休息日）3-自定义每日受理时间（不含节假日和休息日））")
	private Short windowType;	//交易受理窗口类型（0-全天(含节假日和休息日)1-全天(不含节假日和休息日)2-自定义每日受理时间（含节假日和休息日）3-自定义每日受理时间（不含节假日和休息日））
	@ApiModelProperty("受理开始时间（当window_type为2或者3时）")
	private Date windowStart;	//受理开始时间（当window_type为2或者3时）
	@ApiModelProperty("受理截止时间（当window_type为2或者3时）")
	private Date windowEnd;	//受理截止时间（当window_type为2或者3时）
	@ApiModelProperty("记录状态（0-启动1-注销/停用2-新增待审核3-修改待审核）")
	private Integer recordStatus;	//记录状态（0-启动1-注销/停用2-新增待审核3-修改待审核）
	@ApiModelProperty("最后修改时间")
	private Date lastModifiTime;	//最后修改时间


}