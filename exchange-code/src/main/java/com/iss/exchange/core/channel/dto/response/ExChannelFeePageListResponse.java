package com.iss.exchange.core.channel.dto.response;

import java.util.List;

import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.base.dto.response.BasePageListResponse;
import com.iss.exchange.core.channel.dto.ExChannelFeeDTO;
import com.iss.exchange.core.channel.entity.ExChannelFee;
public class ExChannelFeePageListResponse extends BasePageListResponse{

	private static final long serialVersionUID = 1L;

	public ExChannelFeePageListResponse(BasePageListRequest request) {
		super(request);
	}
	private List<? extends ExChannelFee> exChannelFeeDTOList;
	public List<? extends ExChannelFee> getExChannelFeeDTOList() {
		return exChannelFeeDTOList;
	}
	public void setExChannelFeeDTOList(List<? extends ExChannelFeeDTO> exChannelFeeDTOList) {
		this.exChannelFeeDTOList = exChannelFeeDTOList;
	}
}