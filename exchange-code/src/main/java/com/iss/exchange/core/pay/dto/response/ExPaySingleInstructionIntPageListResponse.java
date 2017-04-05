package com.iss.exchange.core.pay.dto.response;

import java.util.List;

import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.base.dto.response.BasePageListResponse;
import com.iss.exchange.core.pay.dto.ExPaySingleInstructionIntDTO;
import com.iss.exchange.core.pay.entity.ExPaySingleInstructionInt;
public class ExPaySingleInstructionIntPageListResponse extends BasePageListResponse{

	private static final long serialVersionUID = 1L;

	public ExPaySingleInstructionIntPageListResponse(BasePageListRequest request) {
		super(request);
	}
	private List<? extends ExPaySingleInstructionInt> exPaySingleInstructionIntDTOList;
	public List<? extends ExPaySingleInstructionInt> getExPaySingleInstructionIntDTOList() {
		return exPaySingleInstructionIntDTOList;
	}
	public void setExPaySingleInstructionIntDTOList(List<? extends ExPaySingleInstructionIntDTO> exPaySingleInstructionIntDTOList) {
		this.exPaySingleInstructionIntDTOList = exPaySingleInstructionIntDTOList;
	}
}