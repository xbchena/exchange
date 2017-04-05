package com.iss.exchange.core.route.dto.request;

import java.util.List;
import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.route.dto.ExRouteStaticInfoDTO;
public class ExRouteStaticInfoPageListRequest extends BasePageListRequest{

	private static final long serialVersionUID = 1L;

	private ExRouteStaticInfoDTO exRouteStaticInfoDTO = new ExRouteStaticInfoDTO();

	public ExRouteStaticInfoDTO getExRouteStaticInfoDTO() {
		return exRouteStaticInfoDTO;
	}
	public void setExRouteStaticInfoDTO(ExRouteStaticInfoDTO exRouteStaticInfoDTO) {
		this.exRouteStaticInfoDTO = exRouteStaticInfoDTO;
	}
}