package com.iss.exchange.core.pay.dto.request;

import java.util.List;
import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.pay.dto.ExPayRouteInstructionOutDetailDTO;
public class ExPayRouteInstructionOutDetailPageListRequest extends BasePageListRequest{

	private static final long serialVersionUID = 1L;

	private ExPayRouteInstructionOutDetailDTO exPayRouteInstructionOutDetailDTO = new ExPayRouteInstructionOutDetailDTO();

	public ExPayRouteInstructionOutDetailDTO getExPayRouteInstructionOutDetailDTO() {
		return exPayRouteInstructionOutDetailDTO;
	}
	public void setExPayRouteInstructionOutDetailDTO(ExPayRouteInstructionOutDetailDTO exPayRouteInstructionOutDetailDTO) {
		this.exPayRouteInstructionOutDetailDTO = exPayRouteInstructionOutDetailDTO;
	}
}