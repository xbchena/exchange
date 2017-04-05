package com.iss.exchange.core.route.dto.response;

import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.base.dto.BaseResponse;
import com.iss.exchange.core.route.dto.ExRouteStaticInfoDTO;
public class ExRouteStaticInfoResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;

	public ExRouteStaticInfoResponse(BaseRequest request) {
		super(request);
	}
	private ExRouteStaticInfoDTO exRouteStaticInfoDTO = new ExRouteStaticInfoDTO();

	public ExRouteStaticInfoDTO getExRouteStaticInfoDTO() {
		return exRouteStaticInfoDTO;
	}
	public void setExRouteStaticInfoDTO(ExRouteStaticInfoDTO exRouteStaticInfoDTO) {
		this.exRouteStaticInfoDTO = exRouteStaticInfoDTO;
	}
}