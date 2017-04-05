package com.iss.exchange.core.pay.dto.response;

import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.base.dto.BaseResponse;
import com.iss.exchange.core.pay.dto.ExRecBatchInstructionIntDetailDTO;
public class ExRecBatchInstructionIntDetailResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;

	public ExRecBatchInstructionIntDetailResponse(BaseRequest request) {
		super(request);
	}
	private ExRecBatchInstructionIntDetailDTO exRecBatchInstructionIntDetailDTO = new ExRecBatchInstructionIntDetailDTO();

	public ExRecBatchInstructionIntDetailDTO getExRecBatchInstructionIntDetailDTO() {
		return exRecBatchInstructionIntDetailDTO;
	}
	public void setExRecBatchInstructionIntDetailDTO(ExRecBatchInstructionIntDetailDTO exRecBatchInstructionIntDetailDTO) {
		this.exRecBatchInstructionIntDetailDTO = exRecBatchInstructionIntDetailDTO;
	}
}