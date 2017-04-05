package com.iss.exchange.core.channel.dto.request;

import java.util.List;
import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.channel.dto.ExChannelAbilityDTO;
public class ExChannelAbilityPageListRequest extends BasePageListRequest{

	private static final long serialVersionUID = 1L;

	private ExChannelAbilityDTO exChannelAbilityDTO = new ExChannelAbilityDTO();

	public ExChannelAbilityDTO getExChannelAbilityDTO() {
		return exChannelAbilityDTO;
	}
	public void setExChannelAbilityDTO(ExChannelAbilityDTO exChannelAbilityDTO) {
		this.exChannelAbilityDTO = exChannelAbilityDTO;
	}
}