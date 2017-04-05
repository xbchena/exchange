package com.iss.exchange.core.account.dto.request;

import java.util.List;
import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.account.dto.ExAccountDTO;
public class ExAccountPageListRequest extends BasePageListRequest{

	private static final long serialVersionUID = 1L;

	private ExAccountDTO exAccountDTO = new ExAccountDTO();

	public ExAccountDTO getExAccountDTO() {
		return exAccountDTO;
	}
	public void setExAccountDTO(ExAccountDTO exAccountDTO) {
		this.exAccountDTO = exAccountDTO;
	}
}