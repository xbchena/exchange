package com.iss.exchange.core.pay.dto.request;

import java.util.List;
import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.pay.dto.ExPayRouteInstructionOutDTO;
public class ExPayRouteInstructionOutPageListRequest extends BasePageListRequest{

	private static final long serialVersionUID = 1L;

	private ExPayRouteInstructionOutDTO exPayRouteInstructionOutDTO = new ExPayRouteInstructionOutDTO();

	public ExPayRouteInstructionOutDTO getExPayRouteInstructionOutDTO() {
		return exPayRouteInstructionOutDTO;
	}
	public void setExPayRouteInstructionOutDTO(ExPayRouteInstructionOutDTO exPayRouteInstructionOutDTO) {
		this.exPayRouteInstructionOutDTO = exPayRouteInstructionOutDTO;
	}
}