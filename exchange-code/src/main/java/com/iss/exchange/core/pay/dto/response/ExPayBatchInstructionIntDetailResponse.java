package com.iss.exchange.core.pay.dto.response;

import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.base.dto.BaseResponse;
import com.iss.exchange.core.pay.dto.ExPayBatchInstructionIntDetailDTO;
public class ExPayBatchInstructionIntDetailResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;

	public ExPayBatchInstructionIntDetailResponse(BaseRequest request) {
		super(request);
	}
	private ExPayBatchInstructionIntDetailDTO exPayBatchInstructionIntDetailDTO = new ExPayBatchInstructionIntDetailDTO();

	public ExPayBatchInstructionIntDetailDTO getExPayBatchInstructionIntDetailDTO() {
		return exPayBatchInstructionIntDetailDTO;
	}
	public void setExPayBatchInstructionIntDetailDTO(ExPayBatchInstructionIntDetailDTO exPayBatchInstructionIntDetailDTO) {
		this.exPayBatchInstructionIntDetailDTO = exPayBatchInstructionIntDetailDTO;
	}
}