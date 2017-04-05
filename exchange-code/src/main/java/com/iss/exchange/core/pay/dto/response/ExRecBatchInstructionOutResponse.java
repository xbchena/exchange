package com.iss.exchange.core.pay.dto.response;

import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.base.dto.BaseResponse;
import com.iss.exchange.core.pay.dto.ExRecBatchInstructionOutDTO;
public class ExRecBatchInstructionOutResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;

	public ExRecBatchInstructionOutResponse(BaseRequest request) {
		super(request);
	}
	private ExRecBatchInstructionOutDTO exRecBatchInstructionOutDTO = new ExRecBatchInstructionOutDTO();

	public ExRecBatchInstructionOutDTO getExRecBatchInstructionOutDTO() {
		return exRecBatchInstructionOutDTO;
	}
	public void setExRecBatchInstructionOutDTO(ExRecBatchInstructionOutDTO exRecBatchInstructionOutDTO) {
		this.exRecBatchInstructionOutDTO = exRecBatchInstructionOutDTO;
	}
}