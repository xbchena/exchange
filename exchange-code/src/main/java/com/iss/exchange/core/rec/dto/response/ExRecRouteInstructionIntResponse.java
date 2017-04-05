package com.iss.exchange.core.rec.dto.response;

import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.base.dto.BaseResponse;
import com.iss.exchange.core.rec.dto.ExRecRouteInstructionIntDTO;
public class ExRecRouteInstructionIntResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;

	public ExRecRouteInstructionIntResponse(BaseRequest request) {
		super(request);
	}
	private ExRecRouteInstructionIntDTO exRecRouteInstructionIntDTO = new ExRecRouteInstructionIntDTO();

	public ExRecRouteInstructionIntDTO getExRecRouteInstructionIntDTO() {
		return exRecRouteInstructionIntDTO;
	}
	public void setExRecRouteInstructionIntDTO(ExRecRouteInstructionIntDTO exRecRouteInstructionIntDTO) {
		this.exRecRouteInstructionIntDTO = exRecRouteInstructionIntDTO;
	}
}