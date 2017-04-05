package com.iss.exchange.core.rec.dto.response;

import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.base.dto.BaseResponse;
import com.iss.exchange.core.rec.dto.ExRecRouteInstructionIntDetailDTO;
public class ExRecRouteInstructionIntDetailResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;

	public ExRecRouteInstructionIntDetailResponse(BaseRequest request) {
		super(request);
	}
	private ExRecRouteInstructionIntDetailDTO exRecRouteInstructionIntDetailDTO = new ExRecRouteInstructionIntDetailDTO();

	public ExRecRouteInstructionIntDetailDTO getExRecRouteInstructionIntDetailDTO() {
		return exRecRouteInstructionIntDetailDTO;
	}
	public void setExRecRouteInstructionIntDetailDTO(ExRecRouteInstructionIntDetailDTO exRecRouteInstructionIntDetailDTO) {
		this.exRecRouteInstructionIntDetailDTO = exRecRouteInstructionIntDetailDTO;
	}
}