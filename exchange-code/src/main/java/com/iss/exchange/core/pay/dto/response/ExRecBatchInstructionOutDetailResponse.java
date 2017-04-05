package com.iss.exchange.core.pay.dto.response;

import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.base.dto.BaseResponse;
import com.iss.exchange.core.pay.dto.ExRecBatchInstructionOutDetailDTO;
public class ExRecBatchInstructionOutDetailResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;

	public ExRecBatchInstructionOutDetailResponse(BaseRequest request) {
		super(request);
	}
	private ExRecBatchInstructionOutDetailDTO exRecBatchInstructionOutDetailDTO = new ExRecBatchInstructionOutDetailDTO();

	public ExRecBatchInstructionOutDetailDTO getExRecBatchInstructionOutDetailDTO() {
		return exRecBatchInstructionOutDetailDTO;
	}
	public void setExRecBatchInstructionOutDetailDTO(ExRecBatchInstructionOutDetailDTO exRecBatchInstructionOutDetailDTO) {
		this.exRecBatchInstructionOutDetailDTO = exRecBatchInstructionOutDetailDTO;
	}
}