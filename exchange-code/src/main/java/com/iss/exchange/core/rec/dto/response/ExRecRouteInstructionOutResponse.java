package com.iss.exchange.core.rec.dto.response;

import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.base.dto.BaseResponse;
import com.iss.exchange.core.rec.dto.ExRecRouteInstructionOutDTO;
public class ExRecRouteInstructionOutResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;

	public ExRecRouteInstructionOutResponse(BaseRequest request) {
		super(request);
	}
	private ExRecRouteInstructionOutDTO exRecRouteInstructionOutDTO = new ExRecRouteInstructionOutDTO();

	public ExRecRouteInstructionOutDTO getExRecRouteInstructionOutDTO() {
		return exRecRouteInstructionOutDTO;
	}
	public void setExRecRouteInstructionOutDTO(ExRecRouteInstructionOutDTO exRecRouteInstructionOutDTO) {
		this.exRecRouteInstructionOutDTO = exRecRouteInstructionOutDTO;
	}
}