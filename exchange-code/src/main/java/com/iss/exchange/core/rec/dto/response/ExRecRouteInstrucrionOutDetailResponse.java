package com.iss.exchange.core.rec.dto.response;

import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.base.dto.BaseResponse;
import com.iss.exchange.core.rec.dto.ExRecRouteInstrucrionOutDetailDTO;
public class ExRecRouteInstrucrionOutDetailResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;

	public ExRecRouteInstrucrionOutDetailResponse(BaseRequest request) {
		super(request);
	}
	private ExRecRouteInstrucrionOutDetailDTO exRecRouteInstrucrionOutDetailDTO = new ExRecRouteInstrucrionOutDetailDTO();

	public ExRecRouteInstrucrionOutDetailDTO getExRecRouteInstrucrionOutDetailDTO() {
		return exRecRouteInstrucrionOutDetailDTO;
	}
	public void setExRecRouteInstrucrionOutDetailDTO(ExRecRouteInstrucrionOutDetailDTO exRecRouteInstrucrionOutDetailDTO) {
		this.exRecRouteInstrucrionOutDetailDTO = exRecRouteInstrucrionOutDetailDTO;
	}
}