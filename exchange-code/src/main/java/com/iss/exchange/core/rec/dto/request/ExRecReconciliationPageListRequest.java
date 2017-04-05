package com.iss.exchange.core.rec.dto.request;

import java.util.List;
import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.rec.dto.ExRecReconciliationDTO;
public class ExRecReconciliationPageListRequest extends BasePageListRequest{

	private static final long serialVersionUID = 1L;

	private ExRecReconciliationDTO exRecReconciliationDTO = new ExRecReconciliationDTO();

	public ExRecReconciliationDTO getExRecReconciliationDTO() {
		return exRecReconciliationDTO;
	}
	public void setExRecReconciliationDTO(ExRecReconciliationDTO exRecReconciliationDTO) {
		this.exRecReconciliationDTO = exRecReconciliationDTO;
	}
}