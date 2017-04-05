package com.iss.exchange.core.common.dto.request;

import java.util.List;
import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.common.dto.ExBankParameterDTO;
public class ExBankParameterPageListRequest extends BasePageListRequest{

	private static final long serialVersionUID = 1L;

	private ExBankParameterDTO exBankParameterDTO = new ExBankParameterDTO();

	public ExBankParameterDTO getExBankParameterDTO() {
		return exBankParameterDTO;
	}
	public void setExBankParameterDTO(ExBankParameterDTO exBankParameterDTO) {
		this.exBankParameterDTO = exBankParameterDTO;
	}
}