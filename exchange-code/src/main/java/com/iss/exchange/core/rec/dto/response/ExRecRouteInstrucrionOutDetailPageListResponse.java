package com.iss.exchange.core.rec.dto.response;

import java.util.List;

import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.base.dto.response.BasePageListResponse;
import com.iss.exchange.core.rec.dto.ExRecRouteInstrucrionOutDetailDTO;
import com.iss.exchange.core.rec.entity.ExRecRouteInstrucrionOutDetail;
public class ExRecRouteInstrucrionOutDetailPageListResponse extends BasePageListResponse{

	private static final long serialVersionUID = 1L;

	public ExRecRouteInstrucrionOutDetailPageListResponse(BasePageListRequest request) {
		super(request);
	}
	private List<? extends ExRecRouteInstrucrionOutDetail> exRecRouteInstrucrionOutDetailDTOList;
	public List<? extends ExRecRouteInstrucrionOutDetail> getExRecRouteInstrucrionOutDetailDTOList() {
		return exRecRouteInstrucrionOutDetailDTOList;
	}
	public void setExRecRouteInstrucrionOutDetailDTOList(List<? extends ExRecRouteInstrucrionOutDetailDTO> exRecRouteInstrucrionOutDetailDTOList) {
		this.exRecRouteInstrucrionOutDetailDTOList = exRecRouteInstrucrionOutDetailDTOList;
	}
}