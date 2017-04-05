package com.iss.exchange.core.rec.dto.request;

import java.util.List;
import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.rec.dto.ExRecSingleInstructionOutDTO;
public class ExRecSingleInstructionOutPageListRequest extends BasePageListRequest{

	private static final long serialVersionUID = 1L;

	private ExRecSingleInstructionOutDTO exRecSingleInstructionOutDTO = new ExRecSingleInstructionOutDTO();

	public ExRecSingleInstructionOutDTO getExRecSingleInstructionOutDTO() {
		return exRecSingleInstructionOutDTO;
	}
	public void setExRecSingleInstructionOutDTO(ExRecSingleInstructionOutDTO exRecSingleInstructionOutDTO) {
		this.exRecSingleInstructionOutDTO = exRecSingleInstructionOutDTO;
	}
}