package com.iss.exchange.core.transaction.dto.request;

import java.util.List;
import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.transaction.dto.ExReconciliationResultDTO;
public class ExReconciliationResultPageListRequest extends BasePageListRequest{

	private static final long serialVersionUID = 1L;

	private ExReconciliationResultDTO exReconciliationResultDTO = new ExReconciliationResultDTO();

	public ExReconciliationResultDTO getExReconciliationResultDTO() {
		return exReconciliationResultDTO;
	}
	public void setExReconciliationResultDTO(ExReconciliationResultDTO exReconciliationResultDTO) {
		this.exReconciliationResultDTO = exReconciliationResultDTO;
	}
}