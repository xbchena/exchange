package com.iss.exchange.core.pay.dto.request;

import java.util.List;
import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.pay.dto.ExRecBatchInstructionOutDetailDTO;
public class ExRecBatchInstructionOutDetailPageListRequest extends BasePageListRequest{

	private static final long serialVersionUID = 1L;

	private ExRecBatchInstructionOutDetailDTO exRecBatchInstructionOutDetailDTO = new ExRecBatchInstructionOutDetailDTO();

	public ExRecBatchInstructionOutDetailDTO getExRecBatchInstructionOutDetailDTO() {
		return exRecBatchInstructionOutDetailDTO;
	}
	public void setExRecBatchInstructionOutDetailDTO(ExRecBatchInstructionOutDetailDTO exRecBatchInstructionOutDetailDTO) {
		this.exRecBatchInstructionOutDetailDTO = exRecBatchInstructionOutDetailDTO;
	}
}