package com.iss.exchange.core.transaction.dto.response;

import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.base.dto.BaseResponse;
import com.iss.exchange.core.transaction.dto.ExBankTransactionHisInfoDTO;
public class ExBankTransactionHisInfoResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;

	public ExBankTransactionHisInfoResponse(BaseRequest request) {
		super(request);
	}
	private ExBankTransactionHisInfoDTO exBankTransactionHisInfoDTO = new ExBankTransactionHisInfoDTO();

	public ExBankTransactionHisInfoDTO getExBankTransactionHisInfoDTO() {
		return exBankTransactionHisInfoDTO;
	}
	public void setExBankTransactionHisInfoDTO(ExBankTransactionHisInfoDTO exBankTransactionHisInfoDTO) {
		this.exBankTransactionHisInfoDTO = exBankTransactionHisInfoDTO;
	}
}