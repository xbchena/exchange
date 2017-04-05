package com.iss.exchange.core.pay.dto.response;

import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.base.dto.BaseResponse;
import com.iss.exchange.core.pay.dto.ExPaySingleInstructionIntDTO;
public class ExPaySingleInstructionIntResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;

	public ExPaySingleInstructionIntResponse(BaseRequest request) {
		super(request);
	}
	private ExPaySingleInstructionIntDTO exPaySingleInstructionIntDTO = new ExPaySingleInstructionIntDTO();

	public ExPaySingleInstructionIntDTO getExPaySingleInstructionIntDTO() {
		return exPaySingleInstructionIntDTO;
	}
	public void setExPaySingleInstructionIntDTO(ExPaySingleInstructionIntDTO exPaySingleInstructionIntDTO) {
		this.exPaySingleInstructionIntDTO = exPaySingleInstructionIntDTO;
	}
}