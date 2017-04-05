package com.iss.exchange.core.channel.dto.response;

import java.util.List;

import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.base.dto.response.BasePageListResponse;
import com.iss.exchange.core.channel.dto.ExChannelAbilityDTO;
import com.iss.exchange.core.channel.entity.ExChannelAbility;
public class ExChannelAbilityPageListResponse extends BasePageListResponse{

	private static final long serialVersionUID = 1L;

	public ExChannelAbilityPageListResponse(BasePageListRequest request) {
		super(request);
	}
	private List<? extends ExChannelAbility> exChannelAbilityDTOList;
	public List<? extends ExChannelAbility> getExChannelAbilityDTOList() {
		return exChannelAbilityDTOList;
	}
	public void setExChannelAbilityDTOList(List<? extends ExChannelAbilityDTO> exChannelAbilityDTOList) {
		this.exChannelAbilityDTOList = exChannelAbilityDTOList;
	}
}