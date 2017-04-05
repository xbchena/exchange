package com.iss.exchange.core.channel.dto;

import com.iss.exchange.core.base.dto.BaseDTO;
import com.iss.exchange.core.channel.entity.ExChannelAbility;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ExChannelAbilityDTO extends ExChannelAbility implements BaseDTO{
	@ApiModelProperty("机构编码描述")
	private String exAgencyDesc;
	@ApiModelProperty("通道编号描述")
	private String exChannelDesc;
	@ApiModelProperty("类型编码、BOC-中国银行、ABC-农业银行、ICBC-工商银行、CCB-建设银行、CMB-招商银行、SPDB-浦发银行、CEB-光大银行、PAB-平安银行、CIB-兴业银行、CMBC-民生银行、CGB-广发银行描述")
	private String exOppBankTypeDesc;


}