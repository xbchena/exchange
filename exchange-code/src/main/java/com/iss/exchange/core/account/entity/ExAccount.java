package com.iss.exchange.core.account.entity;

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

@ApiModel("基础信息--银行账号/第三方商户号表")
@Data
public class ExAccount extends BaseEntity{
	@ApiModelProperty("")
	private BigInteger exAccountId;	//
	@ApiModelProperty("账户号/商户号")
	private String exAccountNo;	//账户号/商户号
	@ApiModelProperty("户名")
	private String exAccountName;	//户名
	@ApiModelProperty("账号英文名称")
	private String exAccountNameEn;	//账号英文名称
	@ApiModelProperty("开户行")
	private String bankName;	//开户行
	@ApiModelProperty("银行类型编号、BOC-中国银行、ABC-农业银行、ICBC-工商银行、CCB-建设银行、CMB-招商银行、SPDB-浦发银行、CEB-光大银行、PAB-平安银行、CIB-兴业银行、CMBC-民生银行、CGB-广发银行")
	private String exBankTypeCode;	//银行类型编号、BOC-中国银行、ABC-农业银行、ICBC-工商银行、CCB-建设银行、CMB-招商银行、SPDB-浦发银行、CEB-光大银行、PAB-平安银行、CIB-兴业银行、CMBC-民生银行、CGB-广发银行
	@ApiModelProperty("状态(0-正常1-销户2-冻结)")
	private Short status;	//状态(0-正常1-销户2-冻结)
	@ApiModelProperty("机构编码")
	private String exAgencyCode;	//机构编码
	@ApiModelProperty("币种")
	private String currency;	//币种
	@ApiModelProperty("开户省份")
	private String provice;	//开户省份
	@ApiModelProperty("开户城市")
	private String city;	//开户城市
	@ApiModelProperty("开户日期")
	private Date openDate;	//开户日期
	@ApiModelProperty("机构号（中行/建行）")
	private String branchCode;	//机构号（中行/建行）
	@ApiModelProperty("联行号（中行/建行）")
	private String branchUniteCode;	//联行号（中行/建行）
	@ApiModelProperty("人行大小额支付系统行号")
	private String cnapsCode;	//人行大小额支付系统行号
	@ApiModelProperty("账户收支属性、0-收支、1-收入、2-支出")
	private Short accountProperty;	//账户收支属性、0-收支、1-收入、2-支出
	@ApiModelProperty("最后修改时间")
	private Date lastModifiTime;	//最后修改时间


}