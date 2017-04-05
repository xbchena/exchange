package com.iss.exchange.core.transaction.dto.response;

import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.base.dto.BaseResponse;
import com.iss.exchange.core.transaction.dto.ExReconciliationResultDTO;
public class ExReconciliationResultResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;

	public ExReconciliationResultResponse(BaseRequest request) {
		super(request);
	}
	private ExReconciliationResultDTO exReconciliationResultDTO = new ExReconciliationResultDTO();

	public ExReconciliationResultDTO getExReconciliationResultDTO() {
		return exReconciliationResultDTO;
	}
	public void setExReconciliationResultDTO(ExReconciliationResultDTO exReconciliationResultDTO) {
		this.exReconciliationResultDTO = exReconciliationResultDTO;
	}
}