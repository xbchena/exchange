package com.iss.exchange.core.channel.dto.request;

import java.util.List;
import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.channel.dto.ExChannelFeeDetailDTO;
public class ExChannelFeeDetailPageListRequest extends BasePageListRequest{

	private static final long serialVersionUID = 1L;

	private ExChannelFeeDetailDTO exChannelFeeDetailDTO = new ExChannelFeeDetailDTO();

	public ExChannelFeeDetailDTO getExChannelFeeDetailDTO() {
		return exChannelFeeDetailDTO;
	}
	public void setExChannelFeeDetailDTO(ExChannelFeeDetailDTO exChannelFeeDetailDTO) {
		this.exChannelFeeDetailDTO = exChannelFeeDetailDTO;
	}
}