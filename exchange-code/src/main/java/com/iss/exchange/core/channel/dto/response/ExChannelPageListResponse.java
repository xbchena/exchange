package com.iss.exchange.core.channel.dto.response;

import java.util.List;

import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.base.dto.response.BasePageListResponse;
import com.iss.exchange.core.channel.dto.ExChannelDTO;
import com.iss.exchange.core.channel.entity.ExChannel;
public class ExChannelPageListResponse extends BasePageListResponse{

	private static final long serialVersionUID = 1L;

	public ExChannelPageListResponse(BasePageListRequest request) {
		super(request);
	}
	private List<? extends ExChannel> exChannelDTOList;
	public List<? extends ExChannel> getExChannelDTOList() {
		return exChannelDTOList;
	}
	public void setExChannelDTOList(List<? extends ExChannelDTO> exChannelDTOList) {
		this.exChannelDTOList = exChannelDTOList;
	}
}