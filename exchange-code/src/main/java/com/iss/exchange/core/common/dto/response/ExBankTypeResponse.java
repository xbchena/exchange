package com.iss.exchange.core.common.dto.response;

import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.base.dto.BaseResponse;
import com.iss.exchange.core.common.dto.ExBankTypeDTO;
public class ExBankTypeResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;

	public ExBankTypeResponse(BaseRequest request) {
		super(request);
	}
	private ExBankTypeDTO exBankTypeDTO = new ExBankTypeDTO();

	public ExBankTypeDTO getExBankTypeDTO() {
		return exBankTypeDTO;
	}
	public void setExBankTypeDTO(ExBankTypeDTO exBankTypeDTO) {
		this.exBankTypeDTO = exBankTypeDTO;
	}
}