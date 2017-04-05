package com.iss.exchange.core.common.dto.response;

import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.base.dto.BaseResponse;
import com.iss.exchange.core.common.dto.ExBankFrontDTO;
public class ExBankFrontResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;

	public ExBankFrontResponse(BaseRequest request) {
		super(request);
	}
	private ExBankFrontDTO exBankFrontDTO = new ExBankFrontDTO();

	public ExBankFrontDTO getExBankFrontDTO() {
		return exBankFrontDTO;
	}
	public void setExBankFrontDTO(ExBankFrontDTO exBankFrontDTO) {
		this.exBankFrontDTO = exBankFrontDTO;
	}
}