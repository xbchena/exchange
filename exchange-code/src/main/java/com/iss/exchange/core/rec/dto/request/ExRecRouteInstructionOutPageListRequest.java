package com.iss.exchange.core.rec.dto.request;

import java.util.List;
import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.rec.dto.ExRecRouteInstructionOutDTO;
public class ExRecRouteInstructionOutPageListRequest extends BasePageListRequest{

	private static final long serialVersionUID = 1L;

	private ExRecRouteInstructionOutDTO exRecRouteInstructionOutDTO = new ExRecRouteInstructionOutDTO();

	public ExRecRouteInstructionOutDTO getExRecRouteInstructionOutDTO() {
		return exRecRouteInstructionOutDTO;
	}
	public void setExRecRouteInstructionOutDTO(ExRecRouteInstructionOutDTO exRecRouteInstructionOutDTO) {
		this.exRecRouteInstructionOutDTO = exRecRouteInstructionOutDTO;
	}
}