package com.iss.exchange.core.channel.dto.request;

import java.util.List;
import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.channel.dto.ExChannelDTO;
public class ExChannelPageListRequest extends BasePageListRequest{

	private static final long serialVersionUID = 1L;

	private ExChannelDTO exChannelDTO = new ExChannelDTO();

	public ExChannelDTO getExChannelDTO() {
		return exChannelDTO;
	}
	public void setExChannelDTO(ExChannelDTO exChannelDTO) {
		this.exChannelDTO = exChannelDTO;
	}
}