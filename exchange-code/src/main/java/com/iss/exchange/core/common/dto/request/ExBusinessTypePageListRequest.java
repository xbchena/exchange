package com.iss.exchange.core.common.dto.request;

import java.util.List;
import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.common.dto.ExBusinessTypeDTO;
public class ExBusinessTypePageListRequest extends BasePageListRequest{

	private static final long serialVersionUID = 1L;

	private ExBusinessTypeDTO exBusinessTypeDTO = new ExBusinessTypeDTO();

	public ExBusinessTypeDTO getExBusinessTypeDTO() {
		return exBusinessTypeDTO;
	}
	public void setExBusinessTypeDTO(ExBusinessTypeDTO exBusinessTypeDTO) {
		this.exBusinessTypeDTO = exBusinessTypeDTO;
	}
}