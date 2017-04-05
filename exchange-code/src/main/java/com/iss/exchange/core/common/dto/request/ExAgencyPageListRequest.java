package com.iss.exchange.core.common.dto.request;

import java.util.List;
import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.common.dto.ExAgencyDTO;
public class ExAgencyPageListRequest extends BasePageListRequest{

	private static final long serialVersionUID = 1L;

	private ExAgencyDTO exAgencyDTO = new ExAgencyDTO();

	public ExAgencyDTO getExAgencyDTO() {
		return exAgencyDTO;
	}
	public void setExAgencyDTO(ExAgencyDTO exAgencyDTO) {
		this.exAgencyDTO = exAgencyDTO;
	}
}