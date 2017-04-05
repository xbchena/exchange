package com.iss.exchange.core.transaction.dto.response;

import java.util.List;

import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.base.dto.response.BasePageListResponse;
import com.iss.exchange.core.transaction.dto.ExBankTransactionHisInfoDTO;
import com.iss.exchange.core.transaction.entity.ExBankTransactionHisInfo;
public class ExBankTransactionHisInfoPageListResponse extends BasePageListResponse{

	private static final long serialVersionUID = 1L;

	public ExBankTransactionHisInfoPageListResponse(BasePageListRequest request) {
		super(request);
	}
	private List<? extends ExBankTransactionHisInfo> exBankTransactionHisInfoDTOList;
	public List<? extends ExBankTransactionHisInfo> getExBankTransactionHisInfoDTOList() {
		return exBankTransactionHisInfoDTOList;
	}
	public void setExBankTransactionHisInfoDTOList(List<? extends ExBankTransactionHisInfoDTO> exBankTransactionHisInfoDTOList) {
		this.exBankTransactionHisInfoDTOList = exBankTransactionHisInfoDTOList;
	}
}