package com.iss.exchange.core.pay.dto.request;

import java.util.List;
import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.pay.dto.ExPayBatchInstructionIntDetailDTO;
public class ExPayBatchInstructionIntDetailPageListRequest extends BasePageListRequest{

	private static final long serialVersionUID = 1L;

	private ExPayBatchInstructionIntDetailDTO exPayBatchInstructionIntDetailDTO = new ExPayBatchInstructionIntDetailDTO();

	public ExPayBatchInstructionIntDetailDTO getExPayBatchInstructionIntDetailDTO() {
		return exPayBatchInstructionIntDetailDTO;
	}
	public void setExPayBatchInstructionIntDetailDTO(ExPayBatchInstructionIntDetailDTO exPayBatchInstructionIntDetailDTO) {
		this.exPayBatchInstructionIntDetailDTO = exPayBatchInstructionIntDetailDTO;
	}
}