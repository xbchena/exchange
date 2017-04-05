package com.iss.exchange.core.transaction.dto.request;

import java.util.List;
import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.transaction.dto.ExBankTransactionHisInfoDTO;
public class ExBankTransactionHisInfoPageListRequest extends BasePageListRequest{

	private static final long serialVersionUID = 1L;

	private ExBankTransactionHisInfoDTO exBankTransactionHisInfoDTO = new ExBankTransactionHisInfoDTO();

	public ExBankTransactionHisInfoDTO getExBankTransactionHisInfoDTO() {
		return exBankTransactionHisInfoDTO;
	}
	public void setExBankTransactionHisInfoDTO(ExBankTransactionHisInfoDTO exBankTransactionHisInfoDTO) {
		this.exBankTransactionHisInfoDTO = exBankTransactionHisInfoDTO;
	}
}