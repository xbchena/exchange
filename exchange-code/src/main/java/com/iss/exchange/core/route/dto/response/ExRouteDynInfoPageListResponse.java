package com.iss.exchange.core.route.dto.response;

import java.util.List;

import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.base.dto.response.BasePageListResponse;
import com.iss.exchange.core.route.dto.ExRouteDynInfoDTO;
import com.iss.exchange.core.route.entity.ExRouteDynInfo;
public class ExRouteDynInfoPageListResponse extends BasePageListResponse{

	private static final long serialVersionUID = 1L;

	public ExRouteDynInfoPageListResponse(BasePageListRequest request) {
		super(request);
	}
	private List<? extends ExRouteDynInfo> exRouteDynInfoDTOList;
	public List<? extends ExRouteDynInfo> getExRouteDynInfoDTOList() {
		return exRouteDynInfoDTOList;
	}
	public void setExRouteDynInfoDTOList(List<? extends ExRouteDynInfoDTO> exRouteDynInfoDTOList) {
		this.exRouteDynInfoDTOList = exRouteDynInfoDTOList;
	}
}