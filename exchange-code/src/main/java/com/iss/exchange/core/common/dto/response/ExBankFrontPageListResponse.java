package com.iss.exchange.core.common.dto.response;

import java.util.List;

import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.base.dto.response.BasePageListResponse;
import com.iss.exchange.core.common.dto.ExBankFrontDTO;
import com.iss.exchange.core.common.entity.ExBankFront;
public class ExBankFrontPageListResponse extends BasePageListResponse{

	private static final long serialVersionUID = 1L;

	public ExBankFrontPageListResponse(BasePageListRequest request) {
		super(request);
	}
	private List<? extends ExBankFront> exBankFrontDTOList;
	public List<? extends ExBankFront> getExBankFrontDTOList() {
		return exBankFrontDTOList;
	}
	public void setExBankFrontDTOList(List<? extends ExBankFrontDTO> exBankFrontDTOList) {
		this.exBankFrontDTOList = exBankFrontDTOList;
	}
}