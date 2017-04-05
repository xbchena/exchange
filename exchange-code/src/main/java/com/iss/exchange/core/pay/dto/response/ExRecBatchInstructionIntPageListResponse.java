package com.iss.exchange.core.pay.dto.response;

import java.util.List;

import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.base.dto.response.BasePageListResponse;
import com.iss.exchange.core.pay.dto.ExRecBatchInstructionIntDTO;
import com.iss.exchange.core.pay.entity.ExRecBatchInstructionInt;
public class ExRecBatchInstructionIntPageListResponse extends BasePageListResponse{

	private static final long serialVersionUID = 1L;

	public ExRecBatchInstructionIntPageListResponse(BasePageListRequest request) {
		super(request);
	}
	private List<? extends ExRecBatchInstructionInt> exRecBatchInstructionIntDTOList;
	public List<? extends ExRecBatchInstructionInt> getExRecBatchInstructionIntDTOList() {
		return exRecBatchInstructionIntDTOList;
	}
	public void setExRecBatchInstructionIntDTOList(List<? extends ExRecBatchInstructionIntDTO> exRecBatchInstructionIntDTOList) {
		this.exRecBatchInstructionIntDTOList = exRecBatchInstructionIntDTOList;
	}
}