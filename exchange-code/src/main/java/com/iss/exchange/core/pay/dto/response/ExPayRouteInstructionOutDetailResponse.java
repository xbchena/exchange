package com.iss.exchange.core.pay.dto.response;

import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.base.dto.BaseResponse;
import com.iss.exchange.core.pay.dto.ExPayRouteInstructionOutDetailDTO;
public class ExPayRouteInstructionOutDetailResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;

	public ExPayRouteInstructionOutDetailResponse(BaseRequest request) {
		super(request);
	}
	private ExPayRouteInstructionOutDetailDTO exPayRouteInstructionOutDetailDTO = new ExPayRouteInstructionOutDetailDTO();

	public ExPayRouteInstructionOutDetailDTO getExPayRouteInstructionOutDetailDTO() {
		return exPayRouteInstructionOutDetailDTO;
	}
	public void setExPayRouteInstructionOutDetailDTO(ExPayRouteInstructionOutDetailDTO exPayRouteInstructionOutDetailDTO) {
		this.exPayRouteInstructionOutDetailDTO = exPayRouteInstructionOutDetailDTO;
	}
}