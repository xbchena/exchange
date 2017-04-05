package com.iss.exchange.core.common.dto;

import com.iss.exchange.core.base.dto.BaseDTO;
import com.iss.exchange.core.common.entity.ExBankSerialRule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ExBankSerialRuleDTO extends ExBankSerialRule implements BaseDTO{
	@ApiModelProperty("机构编码描述")
	private String exAgencyDesc;
	@ApiModelProperty("银行类型编号描述")
	private String exBankTypeDesc;


}