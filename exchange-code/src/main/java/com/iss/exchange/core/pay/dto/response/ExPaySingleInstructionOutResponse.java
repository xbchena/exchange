package com.iss.exchange.core.pay.dto.response;

import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.base.dto.BaseResponse;
import com.iss.exchange.core.pay.dto.ExPaySingleInstructionOutDTO;
public class ExPaySingleInstructionOutResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;

	public ExPaySingleInstructionOutResponse(BaseRequest request) {
		super(request);
	}
	private ExPaySingleInstructionOutDTO exPaySingleInstructionOutDTO = new ExPaySingleInstructionOutDTO();

	public ExPaySingleInstructionOutDTO getExPaySingleInstructionOutDTO() {
		return exPaySingleInstructionOutDTO;
	}
	public void setExPaySingleInstructionOutDTO(ExPaySingleInstructionOutDTO exPaySingleInstructionOutDTO) {
		this.exPaySingleInstructionOutDTO = exPaySingleInstructionOutDTO;
	}
}