package com.iss.exchange.core.pay.dto.response;

import java.util.List;

import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.base.dto.response.BasePageListResponse;
import com.iss.exchange.core.pay.dto.ExRecBatchInstructionOutDTO;
import com.iss.exchange.core.pay.entity.ExRecBatchInstructionOut;
public class ExRecBatchInstructionOutPageListResponse extends BasePageListResponse{

	private static final long serialVersionUID = 1L;

	public ExRecBatchInstructionOutPageListResponse(BasePageListRequest request) {
		super(request);
	}
	private List<? extends ExRecBatchInstructionOut> exRecBatchInstructionOutDTOList;
	public List<? extends ExRecBatchInstructionOut> getExRecBatchInstructionOutDTOList() {
		return exRecBatchInstructionOutDTOList;
	}
	public void setExRecBatchInstructionOutDTOList(List<? extends ExRecBatchInstructionOutDTO> exRecBatchInstructionOutDTOList) {
		this.exRecBatchInstructionOutDTOList = exRecBatchInstructionOutDTOList;
	}
}