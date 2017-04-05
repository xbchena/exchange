package com.iss.exchange.core.pay.dto.request;

import java.util.List;
import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.pay.dto.ExRecBatchInstructionOutDTO;
public class ExRecBatchInstructionOutPageListRequest extends BasePageListRequest{

	private static final long serialVersionUID = 1L;

	private ExRecBatchInstructionOutDTO exRecBatchInstructionOutDTO = new ExRecBatchInstructionOutDTO();

	public ExRecBatchInstructionOutDTO getExRecBatchInstructionOutDTO() {
		return exRecBatchInstructionOutDTO;
	}
	public void setExRecBatchInstructionOutDTO(ExRecBatchInstructionOutDTO exRecBatchInstructionOutDTO) {
		this.exRecBatchInstructionOutDTO = exRecBatchInstructionOutDTO;
	}
}