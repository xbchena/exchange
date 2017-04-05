package com.iss.exchange.core.channel.dto.request;

import java.util.List;
import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.channel.dto.ExChannelFeeDTO;
public class ExChannelFeePageListRequest extends BasePageListRequest{

	private static final long serialVersionUID = 1L;

	private ExChannelFeeDTO exChannelFeeDTO = new ExChannelFeeDTO();

	public ExChannelFeeDTO getExChannelFeeDTO() {
		return exChannelFeeDTO;
	}
	public void setExChannelFeeDTO(ExChannelFeeDTO exChannelFeeDTO) {
		this.exChannelFeeDTO = exChannelFeeDTO;
	}
}