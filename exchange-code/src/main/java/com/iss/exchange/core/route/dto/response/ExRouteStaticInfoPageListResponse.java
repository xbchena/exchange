package com.iss.exchange.core.route.dto.response;

import java.util.List;

import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.base.dto.response.BasePageListResponse;
import com.iss.exchange.core.route.dto.ExRouteStaticInfoDTO;
import com.iss.exchange.core.route.entity.ExRouteStaticInfo;
public class ExRouteStaticInfoPageListResponse extends BasePageListResponse{

	private static final long serialVersionUID = 1L;

	public ExRouteStaticInfoPageListResponse(BasePageListRequest request) {
		super(request);
	}
	private List<? extends ExRouteStaticInfo> exRouteStaticInfoDTOList;
	public List<? extends ExRouteStaticInfo> getExRouteStaticInfoDTOList() {
		return exRouteStaticInfoDTOList;
	}
	public void setExRouteStaticInfoDTOList(List<? extends ExRouteStaticInfoDTO> exRouteStaticInfoDTOList) {
		this.exRouteStaticInfoDTOList = exRouteStaticInfoDTOList;
	}
}