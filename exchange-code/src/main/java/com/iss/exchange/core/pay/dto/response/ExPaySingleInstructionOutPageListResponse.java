package com.iss.exchange.core.pay.dto.response;

import java.util.List;

import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.base.dto.response.BasePageListResponse;
import com.iss.exchange.core.pay.dto.ExPaySingleInstructionOutDTO;
import com.iss.exchange.core.pay.entity.ExPaySingleInstructionOut;
public class ExPaySingleInstructionOutPageListResponse extends BasePageListResponse{

	private static final long serialVersionUID = 1L;

	public ExPaySingleInstructionOutPageListResponse(BasePageListRequest request) {
		super(request);
	}
	private List<? extends ExPaySingleInstructionOut> exPaySingleInstructionOutDTOList;
	public List<? extends ExPaySingleInstructionOut> getExPaySingleInstructionOutDTOList() {
		return exPaySingleInstructionOutDTOList;
	}
	public void setExPaySingleInstructionOutDTOList(List<? extends ExPaySingleInstructionOutDTO> exPaySingleInstructionOutDTOList) {
		this.exPaySingleInstructionOutDTOList = exPaySingleInstructionOutDTOList;
	}
}