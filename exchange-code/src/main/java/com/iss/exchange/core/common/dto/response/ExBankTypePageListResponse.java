package com.iss.exchange.core.common.dto.response;

import java.util.List;

import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.base.dto.response.BasePageListResponse;
import com.iss.exchange.core.common.dto.ExBankTypeDTO;
import com.iss.exchange.core.common.entity.ExBankType;
public class ExBankTypePageListResponse extends BasePageListResponse{

	private static final long serialVersionUID = 1L;

	public ExBankTypePageListResponse(BasePageListRequest request) {
		super(request);
	}
	private List<? extends ExBankType> exBankTypeDTOList;
	public List<? extends ExBankType> getExBankTypeDTOList() {
		return exBankTypeDTOList;
	}
	public void setExBankTypeDTOList(List<? extends ExBankTypeDTO> exBankTypeDTOList) {
		this.exBankTypeDTOList = exBankTypeDTOList;
	}
}