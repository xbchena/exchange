package com.iss.exchange.core.common.dto.request;

import java.util.List;
import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.common.dto.ExBankFrontDTO;
public class ExBankFrontPageListRequest extends BasePageListRequest{

	private static final long serialVersionUID = 1L;

	private ExBankFrontDTO exBankFrontDTO = new ExBankFrontDTO();

	public ExBankFrontDTO getExBankFrontDTO() {
		return exBankFrontDTO;
	}
	public void setExBankFrontDTO(ExBankFrontDTO exBankFrontDTO) {
		this.exBankFrontDTO = exBankFrontDTO;
	}
}