package com.iss.exchange.core.pay.dto.response;

import java.util.List;

import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.base.dto.response.BasePageListResponse;
import com.iss.exchange.core.pay.dto.ExPayRouteInstructionOutDTO;
import com.iss.exchange.core.pay.entity.ExPayRouteInstructionOut;
public class ExPayRouteInstructionOutPageListResponse extends BasePageListResponse{

	private static final long serialVersionUID = 1L;

	public ExPayRouteInstructionOutPageListResponse(BasePageListRequest request) {
		super(request);
	}
	private List<? extends ExPayRouteInstructionOut> exPayRouteInstructionOutDTOList;
	public List<? extends ExPayRouteInstructionOut> getExPayRouteInstructionOutDTOList() {
		return exPayRouteInstructionOutDTOList;
	}
	public void setExPayRouteInstructionOutDTOList(List<? extends ExPayRouteInstructionOutDTO> exPayRouteInstructionOutDTOList) {
		this.exPayRouteInstructionOutDTOList = exPayRouteInstructionOutDTOList;
	}
}