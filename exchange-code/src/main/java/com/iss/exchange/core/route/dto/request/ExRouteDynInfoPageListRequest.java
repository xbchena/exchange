package com.iss.exchange.core.route.dto.request;

import java.util.List;
import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.route.dto.ExRouteDynInfoDTO;
public class ExRouteDynInfoPageListRequest extends BasePageListRequest{

	private static final long serialVersionUID = 1L;

	private ExRouteDynInfoDTO exRouteDynInfoDTO = new ExRouteDynInfoDTO();

	public ExRouteDynInfoDTO getExRouteDynInfoDTO() {
		return exRouteDynInfoDTO;
	}
	public void setExRouteDynInfoDTO(ExRouteDynInfoDTO exRouteDynInfoDTO) {
		this.exRouteDynInfoDTO = exRouteDynInfoDTO;
	}
}