package com.iss.exchange.core.rec.dto.request;

import java.util.List;
import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.rec.dto.ExRecRouteInstrucrionOutDetailDTO;
public class ExRecRouteInstrucrionOutDetailPageListRequest extends BasePageListRequest{

	private static final long serialVersionUID = 1L;

	private ExRecRouteInstrucrionOutDetailDTO exRecRouteInstrucrionOutDetailDTO = new ExRecRouteInstrucrionOutDetailDTO();

	public ExRecRouteInstrucrionOutDetailDTO getExRecRouteInstrucrionOutDetailDTO() {
		return exRecRouteInstrucrionOutDetailDTO;
	}
	public void setExRecRouteInstrucrionOutDetailDTO(ExRecRouteInstrucrionOutDetailDTO exRecRouteInstrucrionOutDetailDTO) {
		this.exRecRouteInstrucrionOutDetailDTO = exRecRouteInstrucrionOutDetailDTO;
	}
}