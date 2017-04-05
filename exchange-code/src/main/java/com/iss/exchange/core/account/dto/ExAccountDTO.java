package com.iss.exchange.core.account.dto;

import com.iss.exchange.core.base.dto.BaseDTO;
import com.iss.exchange.core.account.entity.ExAccount;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ExAccountDTO extends ExAccount implements BaseDTO{
	@ApiModelProperty("银行类型编号、BOC-中国银行、ABC-农业银行、ICBC-工商银行、CCB-建设银行、CMB-招商银行、SPDB-浦发银行、CEB-光大银行、PAB-平安银行、CIB-兴业银行、CMBC-民生银行、CGB-广发银行描述")
	private String exBankTypeDesc;
	@ApiModelProperty("机构编码描述")
	private String exAgencyDesc;
	@ApiModelProperty("机构号（中行/建行）描述")
	private String branchDesc;
	@ApiModelProperty("联行号（中行/建行）描述")
	private String branchUniteDesc;
	@ApiModelProperty("人行大小额支付系统行号描述")
	private String cnapsDesc;


}