package com.iss.exchange.core.rec.dto.response;

import java.util.List;

import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.base.dto.response.BasePageListResponse;
import com.iss.exchange.core.rec.dto.ExRecRouteInstructionOutDTO;
import com.iss.exchange.core.rec.entity.ExRecRouteInstructionOut;
public class ExRecRouteInstructionOutPageListResponse extends BasePageListResponse{

	private static final long serialVersionUID = 1L;

	public ExRecRouteInstructionOutPageListResponse(BasePageListRequest request) {
		super(request);
	}
	private List<? extends ExRecRouteInstructionOut> exRecRouteInstructionOutDTOList;
	public List<? extends ExRecRouteInstructionOut> getExRecRouteInstructionOutDTOList() {
		return exRecRouteInstructionOutDTOList;
	}
	public void setExRecRouteInstructionOutDTOList(List<? extends ExRecRouteInstructionOutDTO> exRecRouteInstructionOutDTOList) {
		this.exRecRouteInstructionOutDTOList = exRecRouteInstructionOutDTOList;
	}
}