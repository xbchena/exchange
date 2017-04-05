package com.iss.exchange.core.channel.dto.response;

import java.util.List;
import com.iss.exchange.core.base.dto.BaseResponse;
import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.channel.entity.ExChannelAbility;
import com.iss.exchange.core.channel.dto.ExChannelAbilityDTO;
import com.iss.exchange.core.channel.entity.ExChannelAbility;
public class ExChannelAbilityResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;

	public ExChannelAbilityResponse(BaseRequest request) {
		super(request);
	}
	private ExChannelAbilityDTO exChannelAbilityDTO = new ExChannelAbilityDTO();

	public ExChannelAbilityDTO getExChannelAbilityDTO() {
		return exChannelAbilityDTO;
	}
	public void setExChannelAbilityDTO(ExChannelAbilityDTO exChannelAbilityDTO) {
		this.exChannelAbilityDTO = exChannelAbilityDTO;
	}
}