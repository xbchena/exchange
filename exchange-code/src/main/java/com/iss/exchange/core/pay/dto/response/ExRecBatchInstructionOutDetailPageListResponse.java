package com.iss.exchange.core.pay.dto.response;

import java.util.List;

import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.base.dto.response.BasePageListResponse;
import com.iss.exchange.core.pay.dto.ExRecBatchInstructionOutDetailDTO;
import com.iss.exchange.core.pay.entity.ExRecBatchInstructionOutDetail;
public class ExRecBatchInstructionOutDetailPageListResponse extends BasePageListResponse{

	private static final long serialVersionUID = 1L;

	public ExRecBatchInstructionOutDetailPageListResponse(BasePageListRequest request) {
		super(request);
	}
	private List<? extends ExRecBatchInstructionOutDetail> exRecBatchInstructionOutDetailDTOList;
	public List<? extends ExRecBatchInstructionOutDetail> getExRecBatchInstructionOutDetailDTOList() {
		return exRecBatchInstructionOutDetailDTOList;
	}
	public void setExRecBatchInstructionOutDetailDTOList(List<? extends ExRecBatchInstructionOutDetailDTO> exRecBatchInstructionOutDetailDTOList) {
		this.exRecBatchInstructionOutDetailDTOList = exRecBatchInstructionOutDetailDTOList;
	}
}