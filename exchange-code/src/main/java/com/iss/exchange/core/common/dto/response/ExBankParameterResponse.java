package com.iss.exchange.core.common.dto.response;

import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.base.dto.BaseResponse;
import com.iss.exchange.core.common.dto.ExBankParameterDTO;
public class ExBankParameterResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;

	public ExBankParameterResponse(BaseRequest request) {
		super(request);
	}
	private ExBankParameterDTO exBankParameterDTO = new ExBankParameterDTO();

	public ExBankParameterDTO getExBankParameterDTO() {
		return exBankParameterDTO;
	}
	public void setExBankParameterDTO(ExBankParameterDTO exBankParameterDTO) {
		this.exBankParameterDTO = exBankParameterDTO;
	}
}