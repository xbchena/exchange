package com.iss.exchange.core.pay.dto.request;

import java.util.List;
import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.pay.dto.ExPaySingleInstructionOutDTO;
public class ExPaySingleInstructionOutPageListRequest extends BasePageListRequest{

	private static final long serialVersionUID = 1L;

	private ExPaySingleInstructionOutDTO exPaySingleInstructionOutDTO = new ExPaySingleInstructionOutDTO();

	public ExPaySingleInstructionOutDTO getExPaySingleInstructionOutDTO() {
		return exPaySingleInstructionOutDTO;
	}
	public void setExPaySingleInstructionOutDTO(ExPaySingleInstructionOutDTO exPaySingleInstructionOutDTO) {
		this.exPaySingleInstructionOutDTO = exPaySingleInstructionOutDTO;
	}
}