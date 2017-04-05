package com.iss.exchange.core.rec.dto.request;

import java.util.List;
import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.rec.dto.ExRecRouteInstructionIntDTO;
public class ExRecRouteInstructionIntPageListRequest extends BasePageListRequest{

	private static final long serialVersionUID = 1L;

	private ExRecRouteInstructionIntDTO exRecRouteInstructionIntDTO = new ExRecRouteInstructionIntDTO();

	public ExRecRouteInstructionIntDTO getExRecRouteInstructionIntDTO() {
		return exRecRouteInstructionIntDTO;
	}
	public void setExRecRouteInstructionIntDTO(ExRecRouteInstructionIntDTO exRecRouteInstructionIntDTO) {
		this.exRecRouteInstructionIntDTO = exRecRouteInstructionIntDTO;
	}
}