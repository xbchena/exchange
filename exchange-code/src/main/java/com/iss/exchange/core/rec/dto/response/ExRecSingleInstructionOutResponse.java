package com.iss.exchange.core.rec.dto.response;

import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.base.dto.BaseResponse;
import com.iss.exchange.core.rec.dto.ExRecSingleInstructionOutDTO;
public class ExRecSingleInstructionOutResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;

	public ExRecSingleInstructionOutResponse(BaseRequest request) {
		super(request);
	}
	private ExRecSingleInstructionOutDTO exRecSingleInstructionOutDTO = new ExRecSingleInstructionOutDTO();

	public ExRecSingleInstructionOutDTO getExRecSingleInstructionOutDTO() {
		return exRecSingleInstructionOutDTO;
	}
	public void setExRecSingleInstructionOutDTO(ExRecSingleInstructionOutDTO exRecSingleInstructionOutDTO) {
		this.exRecSingleInstructionOutDTO = exRecSingleInstructionOutDTO;
	}
}