package com.iss.exchange.core.pay.dto.response;

import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.base.dto.BaseResponse;
import com.iss.exchange.core.pay.dto.ExRecBatchInstructionIntDTO;
public class ExRecBatchInstructionIntResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;

	public ExRecBatchInstructionIntResponse(BaseRequest request) {
		super(request);
	}
	private ExRecBatchInstructionIntDTO exRecBatchInstructionIntDTO = new ExRecBatchInstructionIntDTO();

	public ExRecBatchInstructionIntDTO getExRecBatchInstructionIntDTO() {
		return exRecBatchInstructionIntDTO;
	}
	public void setExRecBatchInstructionIntDTO(ExRecBatchInstructionIntDTO exRecBatchInstructionIntDTO) {
		this.exRecBatchInstructionIntDTO = exRecBatchInstructionIntDTO;
	}
}