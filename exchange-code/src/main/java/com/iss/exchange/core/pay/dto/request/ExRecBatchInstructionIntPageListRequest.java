package com.iss.exchange.core.pay.dto.request;

import java.util.List;
import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.pay.dto.ExRecBatchInstructionIntDTO;
public class ExRecBatchInstructionIntPageListRequest extends BasePageListRequest{

	private static final long serialVersionUID = 1L;

	private ExRecBatchInstructionIntDTO exRecBatchInstructionIntDTO = new ExRecBatchInstructionIntDTO();

	public ExRecBatchInstructionIntDTO getExRecBatchInstructionIntDTO() {
		return exRecBatchInstructionIntDTO;
	}
	public void setExRecBatchInstructionIntDTO(ExRecBatchInstructionIntDTO exRecBatchInstructionIntDTO) {
		this.exRecBatchInstructionIntDTO = exRecBatchInstructionIntDTO;
	}
}