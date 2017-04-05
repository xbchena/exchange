package com.iss.exchange.core.rec.dto.request;

import java.util.List;
import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.rec.dto.ExRecRouteInstructionIntDetailDTO;
public class ExRecRouteInstructionIntDetailPageListRequest extends BasePageListRequest{

	private static final long serialVersionUID = 1L;

	private ExRecRouteInstructionIntDetailDTO exRecRouteInstructionIntDetailDTO = new ExRecRouteInstructionIntDetailDTO();

	public ExRecRouteInstructionIntDetailDTO getExRecRouteInstructionIntDetailDTO() {
		return exRecRouteInstructionIntDetailDTO;
	}
	public void setExRecRouteInstructionIntDetailDTO(ExRecRouteInstructionIntDetailDTO exRecRouteInstructionIntDetailDTO) {
		this.exRecRouteInstructionIntDetailDTO = exRecRouteInstructionIntDetailDTO;
	}
}