package com.iss.exchange.core.pay.dto.response;

import java.util.List;

import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.base.dto.response.BasePageListResponse;
import com.iss.exchange.core.pay.dto.ExPayRouteInstructionOutDetailDTO;
import com.iss.exchange.core.pay.entity.ExPayRouteInstructionOutDetail;
public class ExPayRouteInstructionOutDetailPageListResponse extends BasePageListResponse{

	private static final long serialVersionUID = 1L;

	public ExPayRouteInstructionOutDetailPageListResponse(BasePageListRequest request) {
		super(request);
	}
	private List<? extends ExPayRouteInstructionOutDetail> exPayRouteInstructionOutDetailDTOList;
	public List<? extends ExPayRouteInstructionOutDetail> getExPayRouteInstructionOutDetailDTOList() {
		return exPayRouteInstructionOutDetailDTOList;
	}
	public void setExPayRouteInstructionOutDetailDTOList(List<? extends ExPayRouteInstructionOutDetailDTO> exPayRouteInstructionOutDetailDTOList) {
		this.exPayRouteInstructionOutDetailDTOList = exPayRouteInstructionOutDetailDTOList;
	}
}