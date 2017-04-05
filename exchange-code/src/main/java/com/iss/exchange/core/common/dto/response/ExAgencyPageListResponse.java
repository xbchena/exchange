package com.iss.exchange.core.common.dto.response;

import java.util.List;

import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.base.dto.response.BasePageListResponse;
import com.iss.exchange.core.common.dto.ExAgencyDTO;
import com.iss.exchange.core.common.entity.ExAgency;
public class ExAgencyPageListResponse extends BasePageListResponse{

	private static final long serialVersionUID = 1L;

	public ExAgencyPageListResponse(BasePageListRequest request) {
		super(request);
	}
	private List<? extends ExAgency> exAgencyDTOList;
	public List<? extends ExAgency> getExAgencyDTOList() {
		return exAgencyDTOList;
	}
	public void setExAgencyDTOList(List<? extends ExAgencyDTO> exAgencyDTOList) {
		this.exAgencyDTOList = exAgencyDTOList;
	}
}