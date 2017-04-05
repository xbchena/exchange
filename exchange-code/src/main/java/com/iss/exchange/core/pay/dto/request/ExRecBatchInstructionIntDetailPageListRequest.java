package com.iss.exchange.core.pay.dto.request;

import java.util.List;
import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.pay.dto.ExRecBatchInstructionIntDetailDTO;
public class ExRecBatchInstructionIntDetailPageListRequest extends BasePageListRequest{

	private static final long serialVersionUID = 1L;

	private ExRecBatchInstructionIntDetailDTO exRecBatchInstructionIntDetailDTO = new ExRecBatchInstructionIntDetailDTO();

	public ExRecBatchInstructionIntDetailDTO getExRecBatchInstructionIntDetailDTO() {
		return exRecBatchInstructionIntDetailDTO;
	}
	public void setExRecBatchInstructionIntDetailDTO(ExRecBatchInstructionIntDetailDTO exRecBatchInstructionIntDetailDTO) {
		this.exRecBatchInstructionIntDetailDTO = exRecBatchInstructionIntDetailDTO;
	}
}