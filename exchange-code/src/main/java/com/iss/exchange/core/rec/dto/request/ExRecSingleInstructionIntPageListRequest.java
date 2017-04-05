package com.iss.exchange.core.rec.dto.request;

import java.util.List;
import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.rec.dto.ExRecSingleInstructionIntDTO;
public class ExRecSingleInstructionIntPageListRequest extends BasePageListRequest{

	private static final long serialVersionUID = 1L;

	private ExRecSingleInstructionIntDTO exRecSingleInstructionIntDTO = new ExRecSingleInstructionIntDTO();

	public ExRecSingleInstructionIntDTO getExRecSingleInstructionIntDTO() {
		return exRecSingleInstructionIntDTO;
	}
	public void setExRecSingleInstructionIntDTO(ExRecSingleInstructionIntDTO exRecSingleInstructionIntDTO) {
		this.exRecSingleInstructionIntDTO = exRecSingleInstructionIntDTO;
	}
}