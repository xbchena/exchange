package com.iss.exchange.core.pay.dto.response;

import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.base.dto.BaseResponse;
import com.iss.exchange.core.pay.dto.ExPayBatchInstructionIntDTO;
public class ExPayBatchInstructionIntResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;

	public ExPayBatchInstructionIntResponse(BaseRequest request) {
		super(request);
	}
	private ExPayBatchInstructionIntDTO exPayBatchInstructionIntDTO = new ExPayBatchInstructionIntDTO();

	public ExPayBatchInstructionIntDTO getExPayBatchInstructionIntDTO() {
		return exPayBatchInstructionIntDTO;
	}
	public void setExPayBatchInstructionIntDTO(ExPayBatchInstructionIntDTO exPayBatchInstructionIntDTO) {
		this.exPayBatchInstructionIntDTO = exPayBatchInstructionIntDTO;
	}
}