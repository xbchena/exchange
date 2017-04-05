package com.iss.exchange.core.rec.dto.response;

import java.util.List;

import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.base.dto.response.BasePageListResponse;
import com.iss.exchange.core.rec.dto.ExRecReconciliationDTO;
import com.iss.exchange.core.rec.entity.ExRecReconciliation;
public class ExRecReconciliationPageListResponse extends BasePageListResponse{

	private static final long serialVersionUID = 1L;

	public ExRecReconciliationPageListResponse(BasePageListRequest request) {
		super(request);
	}
	private List<? extends ExRecReconciliation> exRecReconciliationDTOList;
	public List<? extends ExRecReconciliation> getExRecReconciliationDTOList() {
		return exRecReconciliationDTOList;
	}
	public void setExRecReconciliationDTOList(List<? extends ExRecReconciliationDTO> exRecReconciliationDTOList) {
		this.exRecReconciliationDTOList = exRecReconciliationDTOList;
	}
}