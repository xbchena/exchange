package com.iss.exchange.core.route.dto.response;

import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.base.dto.BaseResponse;
import com.iss.exchange.core.route.dto.ExRouteDynInfoDTO;
public class ExRouteDynInfoResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;

	public ExRouteDynInfoResponse(BaseRequest request) {
		super(request);
	}
	private ExRouteDynInfoDTO exRouteDynInfoDTO = new ExRouteDynInfoDTO();

	public ExRouteDynInfoDTO getExRouteDynInfoDTO() {
		return exRouteDynInfoDTO;
	}
	public void setExRouteDynInfoDTO(ExRouteDynInfoDTO exRouteDynInfoDTO) {
		this.exRouteDynInfoDTO = exRouteDynInfoDTO;
	}
}