package com.iss.exchange.core.common.dto.response;

import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.base.dto.BaseResponse;
import com.iss.exchange.core.common.dto.ExBusinessTypeDTO;
public class ExBusinessTypeResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;

	public ExBusinessTypeResponse(BaseRequest request) {
		super(request);
	}
	private ExBusinessTypeDTO exBusinessTypeDTO = new ExBusinessTypeDTO();

	public ExBusinessTypeDTO getExBusinessTypeDTO() {
		return exBusinessTypeDTO;
	}
	public void setExBusinessTypeDTO(ExBusinessTypeDTO exBusinessTypeDTO) {
		this.exBusinessTypeDTO = exBusinessTypeDTO;
	}
}