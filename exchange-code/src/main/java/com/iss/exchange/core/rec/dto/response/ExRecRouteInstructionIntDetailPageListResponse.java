package com.iss.exchange.core.rec.dto.response;

import java.util.List;

import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.base.dto.response.BasePageListResponse;
import com.iss.exchange.core.rec.dto.ExRecRouteInstructionIntDetailDTO;
import com.iss.exchange.core.rec.entity.ExRecRouteInstructionIntDetail;
public class ExRecRouteInstructionIntDetailPageListResponse extends BasePageListResponse{

	private static final long serialVersionUID = 1L;

	public ExRecRouteInstructionIntDetailPageListResponse(BasePageListRequest request) {
		super(request);
	}
	private List<? extends ExRecRouteInstructionIntDetail> exRecRouteInstructionIntDetailDTOList;
	public List<? extends ExRecRouteInstructionIntDetail> getExRecRouteInstructionIntDetailDTOList() {
		return exRecRouteInstructionIntDetailDTOList;
	}
	public void setExRecRouteInstructionIntDetailDTOList(List<? extends ExRecRouteInstructionIntDetailDTO> exRecRouteInstructionIntDetailDTOList) {
		this.exRecRouteInstructionIntDetailDTOList = exRecRouteInstructionIntDetailDTOList;
	}
}