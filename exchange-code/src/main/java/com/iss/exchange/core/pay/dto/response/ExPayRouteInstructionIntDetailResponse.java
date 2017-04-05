package com.iss.exchange.core.pay.dto.response;

import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.base.dto.BaseResponse;
import com.iss.exchange.core.pay.dto.ExPayRouteInstructionIntDetailDTO;
public class ExPayRouteInstructionIntDetailResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;

	public ExPayRouteInstructionIntDetailResponse(BaseRequest request) {
		super(request);
	}
	private ExPayRouteInstructionIntDetailDTO exPayRouteInstructionIntDetailDTO = new ExPayRouteInstructionIntDetailDTO();

	public ExPayRouteInstructionIntDetailDTO getExPayRouteInstructionIntDetailDTO() {
		return exPayRouteInstructionIntDetailDTO;
	}
	public void setExPayRouteInstructionIntDetailDTO(ExPayRouteInstructionIntDetailDTO exPayRouteInstructionIntDetailDTO) {
		this.exPayRouteInstructionIntDetailDTO = exPayRouteInstructionIntDetailDTO;
	}
}