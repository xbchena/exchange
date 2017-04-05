package com.iss.exchange.core.account.dto.response;

import java.util.List;

import com.iss.exchange.core.account.dto.ExAccountDTO;
import com.iss.exchange.core.account.entity.ExAccount;
import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.base.dto.response.BasePageListResponse;
public class ExAccountPageListResponse extends BasePageListResponse{

	private static final long serialVersionUID = 1L;

	public ExAccountPageListResponse(BasePageListRequest request) {
		super(request);
	}
	private List<? extends ExAccount> exAccountDTOList;
	public List<? extends ExAccount> getExAccountDTOList() {
		return exAccountDTOList;
	}
	public void setExAccountDTOList(List<? extends ExAccountDTO> exAccountDTOList) {
		this.exAccountDTOList = exAccountDTOList;
	}
}