package com.iss.exchange.core.pay.dto.response;

import java.util.List;

import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.base.dto.response.BasePageListResponse;
import com.iss.exchange.core.pay.dto.ExPayBatchInstructionIntDTO;
import com.iss.exchange.core.pay.entity.ExPayBatchInstructionInt;
public class ExPayBatchInstructionIntPageListResponse extends BasePageListResponse{

	private static final long serialVersionUID = 1L;

	public ExPayBatchInstructionIntPageListResponse(BasePageListRequest request) {
		super(request);
	}
	private List<? extends ExPayBatchInstructionInt> exPayBatchInstructionIntDTOList;
	public List<? extends ExPayBatchInstructionInt> getExPayBatchInstructionIntDTOList() {
		return exPayBatchInstructionIntDTOList;
	}
	public void setExPayBatchInstructionIntDTOList(List<? extends ExPayBatchInstructionIntDTO> exPayBatchInstructionIntDTOList) {
		this.exPayBatchInstructionIntDTOList = exPayBatchInstructionIntDTOList;
	}
}