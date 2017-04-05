package com.iss.exchange.core.common.dto.request;

import java.util.List;
import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.common.dto.ExBankTypeDTO;
public class ExBankTypePageListRequest extends BasePageListRequest{

	private static final long serialVersionUID = 1L;

	private ExBankTypeDTO exBankTypeDTO = new ExBankTypeDTO();

	public ExBankTypeDTO getExBankTypeDTO() {
		return exBankTypeDTO;
	}
	public void setExBankTypeDTO(ExBankTypeDTO exBankTypeDTO) {
		this.exBankTypeDTO = exBankTypeDTO;
	}
}