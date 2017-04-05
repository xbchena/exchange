package com.iss.exchange.core.rec.dto.response;

import java.util.List;

import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.base.dto.response.BasePageListResponse;
import com.iss.exchange.core.rec.dto.ExRecSingleInstructionOutDTO;
import com.iss.exchange.core.rec.entity.ExRecSingleInstructionOut;
public class ExRecSingleInstructionOutPageListResponse extends BasePageListResponse{

	private static final long serialVersionUID = 1L;

	public ExRecSingleInstructionOutPageListResponse(BasePageListRequest request) {
		super(request);
	}
	private List<? extends ExRecSingleInstructionOut> exRecSingleInstructionOutDTOList;
	public List<? extends ExRecSingleInstructionOut> getExRecSingleInstructionOutDTOList() {
		return exRecSingleInstructionOutDTOList;
	}
	public void setExRecSingleInstructionOutDTOList(List<? extends ExRecSingleInstructionOutDTO> exRecSingleInstructionOutDTOList) {
		this.exRecSingleInstructionOutDTOList = exRecSingleInstructionOutDTOList;
	}
}