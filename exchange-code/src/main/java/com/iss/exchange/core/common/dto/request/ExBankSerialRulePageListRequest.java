package com.iss.exchange.core.common.dto.request;

import java.util.List;
import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.common.dto.ExBankSerialRuleDTO;
public class ExBankSerialRulePageListRequest extends BasePageListRequest{

	private static final long serialVersionUID = 1L;

	private ExBankSerialRuleDTO exBankSerialRuleDTO = new ExBankSerialRuleDTO();

	public ExBankSerialRuleDTO getExBankSerialRuleDTO() {
		return exBankSerialRuleDTO;
	}
	public void setExBankSerialRuleDTO(ExBankSerialRuleDTO exBankSerialRuleDTO) {
		this.exBankSerialRuleDTO = exBankSerialRuleDTO;
	}
}