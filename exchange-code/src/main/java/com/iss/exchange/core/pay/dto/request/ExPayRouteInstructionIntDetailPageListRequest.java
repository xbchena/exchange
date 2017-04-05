package com.iss.exchange.core.pay.dto.request;

import java.util.List;
import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.pay.dto.ExPayRouteInstructionIntDetailDTO;
public class ExPayRouteInstructionIntDetailPageListRequest extends BasePageListRequest{

	private static final long serialVersionUID = 1L;

	private ExPayRouteInstructionIntDetailDTO exPayRouteInstructionIntDetailDTO = new ExPayRouteInstructionIntDetailDTO();

	public ExPayRouteInstructionIntDetailDTO getExPayRouteInstructionIntDetailDTO() {
		return exPayRouteInstructionIntDetailDTO;
	}
	public void setExPayRouteInstructionIntDetailDTO(ExPayRouteInstructionIntDetailDTO exPayRouteInstructionIntDetailDTO) {
		this.exPayRouteInstructionIntDetailDTO = exPayRouteInstructionIntDetailDTO;
	}
}