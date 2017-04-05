package com.iss.exchange.core.rec.dto.response;

import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.base.dto.BaseResponse;
import com.iss.exchange.core.rec.dto.ExRecReconciliationDTO;
public class ExRecReconciliationResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;

	public ExRecReconciliationResponse(BaseRequest request) {
		super(request);
	}
	private ExRecReconciliationDTO exRecReconciliationDTO = new ExRecReconciliationDTO();

	public ExRecReconciliationDTO getExRecReconciliationDTO() {
		return exRecReconciliationDTO;
	}
	public void setExRecReconciliationDTO(ExRecReconciliationDTO exRecReconciliationDTO) {
		this.exRecReconciliationDTO = exRecReconciliationDTO;
	}
}