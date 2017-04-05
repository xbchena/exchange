package com.iss.exchange.core.rec.dto.response;

import java.util.List;

import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.base.dto.response.BasePageListResponse;
import com.iss.exchange.core.rec.dto.ExRecSingleInstructionIntDTO;
import com.iss.exchange.core.rec.entity.ExRecSingleInstructionInt;
public class ExRecSingleInstructionIntPageListResponse extends BasePageListResponse{

	private static final long serialVersionUID = 1L;

	public ExRecSingleInstructionIntPageListResponse(BasePageListRequest request) {
		super(request);
	}
	private List<? extends ExRecSingleInstructionInt> exRecSingleInstructionIntDTOList;
	public List<? extends ExRecSingleInstructionInt> getExRecSingleInstructionIntDTOList() {
		return exRecSingleInstructionIntDTOList;
	}
	public void setExRecSingleInstructionIntDTOList(List<? extends ExRecSingleInstructionIntDTO> exRecSingleInstructionIntDTOList) {
		this.exRecSingleInstructionIntDTOList = exRecSingleInstructionIntDTOList;
	}
}