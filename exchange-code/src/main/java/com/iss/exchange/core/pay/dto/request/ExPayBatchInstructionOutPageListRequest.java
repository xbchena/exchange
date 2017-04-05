package com.iss.exchange.core.pay.dto.request;

import java.util.List;
import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.pay.dto.ExPayBatchInstructionOutDTO;
public class ExPayBatchInstructionOutPageListRequest extends BasePageListRequest{

	private static final long serialVersionUID = 1L;

	private ExPayBatchInstructionOutDTO exPayBatchInstructionOutDTO = new ExPayBatchInstructionOutDTO();

	public ExPayBatchInstructionOutDTO getExPayBatchInstructionOutDTO() {
		return exPayBatchInstructionOutDTO;
	}
	public void setExPayBatchInstructionOutDTO(ExPayBatchInstructionOutDTO exPayBatchInstructionOutDTO) {
		this.exPayBatchInstructionOutDTO = exPayBatchInstructionOutDTO;
	}
}