package com.iss.exchange.core.common.dto.response;

import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.base.dto.BaseResponse;
import com.iss.exchange.core.common.dto.ExBankSerialRuleDTO;
public class ExBankSerialRuleResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;

	public ExBankSerialRuleResponse(BaseRequest request) {
		super(request);
	}
	private ExBankSerialRuleDTO exBankSerialRuleDTO = new ExBankSerialRuleDTO();

	public ExBankSerialRuleDTO getExBankSerialRuleDTO() {
		return exBankSerialRuleDTO;
	}
	public void setExBankSerialRuleDTO(ExBankSerialRuleDTO exBankSerialRuleDTO) {
		this.exBankSerialRuleDTO = exBankSerialRuleDTO;
	}
}