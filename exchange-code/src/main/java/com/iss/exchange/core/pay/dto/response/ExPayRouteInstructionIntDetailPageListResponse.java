package com.iss.exchange.core.pay.dto.response;

import java.util.List;

import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.base.dto.response.BasePageListResponse;
import com.iss.exchange.core.pay.dto.ExPayRouteInstructionIntDetailDTO;
import com.iss.exchange.core.pay.entity.ExPayRouteInstructionIntDetail;
public class ExPayRouteInstructionIntDetailPageListResponse extends BasePageListResponse{

	private static final long serialVersionUID = 1L;

	public ExPayRouteInstructionIntDetailPageListResponse(BasePageListRequest request) {
		super(request);
	}
	private List<? extends ExPayRouteInstructionIntDetail> exPayRouteInstructionIntDetailDTOList;
	public List<? extends ExPayRouteInstructionIntDetail> getExPayRouteInstructionIntDetailDTOList() {
		return exPayRouteInstructionIntDetailDTOList;
	}
	public void setExPayRouteInstructionIntDetailDTOList(List<? extends ExPayRouteInstructionIntDetailDTO> exPayRouteInstructionIntDetailDTOList) {
		this.exPayRouteInstructionIntDetailDTOList = exPayRouteInstructionIntDetailDTOList;
	}
}