package com.iss.exchange.core.pay.dto.response;

import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.base.dto.BaseResponse;
import com.iss.exchange.core.pay.dto.ExPayBatchInstructionOutDTO;
public class ExPayBatchInstructionOutResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;

	public ExPayBatchInstructionOutResponse(BaseRequest request) {
		super(request);
	}
	private ExPayBatchInstructionOutDTO exPayBatchInstructionOutDTO = new ExPayBatchInstructionOutDTO();

	public ExPayBatchInstructionOutDTO getExPayBatchInstructionOutDTO() {
		return exPayBatchInstructionOutDTO;
	}
	public void setExPayBatchInstructionOutDTO(ExPayBatchInstructionOutDTO exPayBatchInstructionOutDTO) {
		this.exPayBatchInstructionOutDTO = exPayBatchInstructionOutDTO;
	}
}