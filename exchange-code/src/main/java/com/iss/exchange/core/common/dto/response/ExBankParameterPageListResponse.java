package com.iss.exchange.core.common.dto.response;

import java.util.List;

import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.base.dto.response.BasePageListResponse;
import com.iss.exchange.core.common.dto.ExBankParameterDTO;
import com.iss.exchange.core.common.entity.ExBankParameter;
public class ExBankParameterPageListResponse extends BasePageListResponse{

	private static final long serialVersionUID = 1L;

	public ExBankParameterPageListResponse(BasePageListRequest request) {
		super(request);
	}
	private List<? extends ExBankParameter> exBankParameterDTOList;
	public List<? extends ExBankParameter> getExBankParameterDTOList() {
		return exBankParameterDTOList;
	}
	public void setExBankParameterDTOList(List<? extends ExBankParameterDTO> exBankParameterDTOList) {
		this.exBankParameterDTOList = exBankParameterDTOList;
	}
}