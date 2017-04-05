package com.iss.exchange.core.common.dto.response;

import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.base.dto.BaseResponse;
import com.iss.exchange.core.common.dto.ExAgencyDTO;
public class ExAgencyResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;

	public ExAgencyResponse(BaseRequest request) {
		super(request);
	}
	private ExAgencyDTO exAgencyDTO = new ExAgencyDTO();

	public ExAgencyDTO getExAgencyDTO() {
		return exAgencyDTO;
	}
	public void setExAgencyDTO(ExAgencyDTO exAgencyDTO) {
		this.exAgencyDTO = exAgencyDTO;
	}
}