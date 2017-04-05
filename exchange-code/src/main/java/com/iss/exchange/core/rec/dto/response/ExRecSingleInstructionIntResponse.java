package com.iss.exchange.core.rec.dto.response;

import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.base.dto.BaseResponse;
import com.iss.exchange.core.rec.dto.ExRecSingleInstructionIntDTO;
public class ExRecSingleInstructionIntResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;

	public ExRecSingleInstructionIntResponse(BaseRequest request) {
		super(request);
	}
	private ExRecSingleInstructionIntDTO exRecSingleInstructionIntDTO = new ExRecSingleInstructionIntDTO();

	public ExRecSingleInstructionIntDTO getExRecSingleInstructionIntDTO() {
		return exRecSingleInstructionIntDTO;
	}
	public void setExRecSingleInstructionIntDTO(ExRecSingleInstructionIntDTO exRecSingleInstructionIntDTO) {
		this.exRecSingleInstructionIntDTO = exRecSingleInstructionIntDTO;
	}
}