package com.iss.exchange.core.pay.dto.response;

import java.util.List;

import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.base.dto.response.BasePageListResponse;
import com.iss.exchange.core.pay.dto.ExPayBatchInstructionOutDTO;
import com.iss.exchange.core.pay.entity.ExPayBatchInstructionOut;
public class ExPayBatchInstructionOutPageListResponse extends BasePageListResponse{

	private static final long serialVersionUID = 1L;

	public ExPayBatchInstructionOutPageListResponse(BasePageListRequest request) {
		super(request);
	}
	private List<? extends ExPayBatchInstructionOut> exPayBatchInstructionOutDTOList;
	public List<? extends ExPayBatchInstructionOut> getExPayBatchInstructionOutDTOList() {
		return exPayBatchInstructionOutDTOList;
	}
	public void setExPayBatchInstructionOutDTOList(List<? extends ExPayBatchInstructionOutDTO> exPayBatchInstructionOutDTOList) {
		this.exPayBatchInstructionOutDTOList = exPayBatchInstructionOutDTOList;
	}
}