package com.iss.exchange.core.channel.dto.response;

import java.util.List;
import com.iss.exchange.core.base.dto.BaseResponse;
import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.channel.entity.ExChannel;
import com.iss.exchange.core.channel.dto.ExChannelDTO;
import com.iss.exchange.core.channel.entity.ExChannel;
public class ExChannelResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;

	public ExChannelResponse(BaseRequest request) {
		super(request);
	}
	private ExChannelDTO exChannelDTO = new ExChannelDTO();

	public ExChannelDTO getExChannelDTO() {
		return exChannelDTO;
	}
	public void setExChannelDTO(ExChannelDTO exChannelDTO) {
		this.exChannelDTO = exChannelDTO;
	}
}