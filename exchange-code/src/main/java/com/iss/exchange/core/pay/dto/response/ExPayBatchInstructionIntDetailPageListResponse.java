package com.iss.exchange.core.pay.dto.response;

import java.util.List;

import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.base.dto.response.BasePageListResponse;
import com.iss.exchange.core.pay.dto.ExPayBatchInstructionIntDetailDTO;
import com.iss.exchange.core.pay.entity.ExPayBatchInstructionIntDetail;
public class ExPayBatchInstructionIntDetailPageListResponse extends BasePageListResponse{

	private static final long serialVersionUID = 1L;

	public ExPayBatchInstructionIntDetailPageListResponse(BasePageListRequest request) {
		super(request);
	}
	private List<? extends ExPayBatchInstructionIntDetail> exPayBatchInstructionIntDetailDTOList;
	public List<? extends ExPayBatchInstructionIntDetail> getExPayBatchInstructionIntDetailDTOList() {
		return exPayBatchInstructionIntDetailDTOList;
	}
	public void setExPayBatchInstructionIntDetailDTOList(List<? extends ExPayBatchInstructionIntDetailDTO> exPayBatchInstructionIntDetailDTOList) {
		this.exPayBatchInstructionIntDetailDTOList = exPayBatchInstructionIntDetailDTOList;
	}
}