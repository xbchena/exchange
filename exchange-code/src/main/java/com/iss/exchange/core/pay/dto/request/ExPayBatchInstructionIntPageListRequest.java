package com.iss.exchange.core.pay.dto.request;

import java.util.List;
import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.pay.dto.ExPayBatchInstructionIntDTO;
public class ExPayBatchInstructionIntPageListRequest extends BasePageListRequest{

	private static final long serialVersionUID = 1L;

	private ExPayBatchInstructionIntDTO exPayBatchInstructionIntDTO = new ExPayBatchInstructionIntDTO();

	public ExPayBatchInstructionIntDTO getExPayBatchInstructionIntDTO() {
		return exPayBatchInstructionIntDTO;
	}
	public void setExPayBatchInstructionIntDTO(ExPayBatchInstructionIntDTO exPayBatchInstructionIntDTO) {
		this.exPayBatchInstructionIntDTO = exPayBatchInstructionIntDTO;
	}
}