package com.iss.exchange.core.transaction.dto.response;

import java.util.List;

import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.base.dto.response.BasePageListResponse;
import com.iss.exchange.core.transaction.dto.ExReconciliationResultDTO;
import com.iss.exchange.core.transaction.entity.ExReconciliationResult;
public class ExReconciliationResultPageListResponse extends BasePageListResponse{

	private static final long serialVersionUID = 1L;

	public ExReconciliationResultPageListResponse(BasePageListRequest request) {
		super(request);
	}
	private List<? extends ExReconciliationResult> exReconciliationResultDTOList;
	public List<? extends ExReconciliationResult> getExReconciliationResultDTOList() {
		return exReconciliationResultDTOList;
	}
	public void setExReconciliationResultDTOList(List<? extends ExReconciliationResultDTO> exReconciliationResultDTOList) {
		this.exReconciliationResultDTOList = exReconciliationResultDTOList;
	}
}