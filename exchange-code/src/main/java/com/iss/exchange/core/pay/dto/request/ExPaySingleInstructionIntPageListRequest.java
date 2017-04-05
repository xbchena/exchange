package com.iss.exchange.core.pay.dto.request;

import java.util.List;
import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.pay.dto.ExPaySingleInstructionIntDTO;
public class ExPaySingleInstructionIntPageListRequest extends BasePageListRequest{

	private static final long serialVersionUID = 1L;

	private ExPaySingleInstructionIntDTO exPaySingleInstructionIntDTO = new ExPaySingleInstructionIntDTO();

	public ExPaySingleInstructionIntDTO getExPaySingleInstructionIntDTO() {
		return exPaySingleInstructionIntDTO;
	}
	public void setExPaySingleInstructionIntDTO(ExPaySingleInstructionIntDTO exPaySingleInstructionIntDTO) {
		this.exPaySingleInstructionIntDTO = exPaySingleInstructionIntDTO;
	}
}