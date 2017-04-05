package com.iss.exchange.core.account.dto.response;

import java.util.List;
import com.iss.exchange.core.base.dto.BaseResponse;
import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.account.entity.ExAccount;
import com.iss.exchange.core.account.dto.ExAccountDTO;
import com.iss.exchange.core.account.entity.ExAccount;
public class ExAccountResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;

	public ExAccountResponse(BaseRequest request) {
		super(request);
	}
	private ExAccountDTO exAccountDTO = new ExAccountDTO();

	public ExAccountDTO getExAccountDTO() {
		return exAccountDTO;
	}
	public void setExAccountDTO(ExAccountDTO exAccountDTO) {
		this.exAccountDTO = exAccountDTO;
	}
}