package com.iss.exchange.core.rec.dto.response;

import java.util.List;

import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.base.dto.response.BasePageListResponse;
import com.iss.exchange.core.rec.dto.ExRecRouteInstructionIntDTO;
import com.iss.exchange.core.rec.entity.ExRecRouteInstructionInt;
public class ExRecRouteInstructionIntPageListResponse extends BasePageListResponse{

	private static final long serialVersionUID = 1L;

	public ExRecRouteInstructionIntPageListResponse(BasePageListRequest request) {
		super(request);
	}
	private List<? extends ExRecRouteInstructionInt> exRecRouteInstructionIntDTOList;
	public List<? extends ExRecRouteInstructionInt> getExRecRouteInstructionIntDTOList() {
		return exRecRouteInstructionIntDTOList;
	}
	public void setExRecRouteInstructionIntDTOList(List<? extends ExRecRouteInstructionIntDTO> exRecRouteInstructionIntDTOList) {
		this.exRecRouteInstructionIntDTOList = exRecRouteInstructionIntDTOList;
	}
}