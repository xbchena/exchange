package com.iss.exchange.core.pay.dto.response;

import java.util.List;

import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.base.dto.response.BasePageListResponse;
import com.iss.exchange.core.pay.dto.ExRecBatchInstructionIntDetailDTO;
import com.iss.exchange.core.pay.entity.ExRecBatchInstructionIntDetail;
public class ExRecBatchInstructionIntDetailPageListResponse extends BasePageListResponse{

	private static final long serialVersionUID = 1L;

	public ExRecBatchInstructionIntDetailPageListResponse(BasePageListRequest request) {
		super(request);
	}
	private List<? extends ExRecBatchInstructionIntDetail> exRecBatchInstructionIntDetailDTOList;
	public List<? extends ExRecBatchInstructionIntDetail> getExRecBatchInstructionIntDetailDTOList() {
		return exRecBatchInstructionIntDetailDTOList;
	}
	public void setExRecBatchInstructionIntDetailDTOList(List<? extends ExRecBatchInstructionIntDetailDTO> exRecBatchInstructionIntDetailDTOList) {
		this.exRecBatchInstructionIntDetailDTOList = exRecBatchInstructionIntDetailDTOList;
	}
}