package com.iss.exchange.core.pay.dto.response;

import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.base.dto.BaseResponse;
import com.iss.exchange.core.pay.dto.ExPayRouteInstructionOutDTO;
public class ExPayRouteInstructionOutResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;

	public ExPayRouteInstructionOutResponse(BaseRequest request) {
		super(request);
	}
	private ExPayRouteInstructionOutDTO exPayRouteInstructionOutDTO = new ExPayRouteInstructionOutDTO();

	public ExPayRouteInstructionOutDTO getExPayRouteInstructionOutDTO() {
		return exPayRouteInstructionOutDTO;
	}
	public void setExPayRouteInstructionOutDTO(ExPayRouteInstructionOutDTO exPayRouteInstructionOutDTO) {
		this.exPayRouteInstructionOutDTO = exPayRouteInstructionOutDTO;
	}
}