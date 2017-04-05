package com.iss.exchange.core.channel.dto.response;

import java.util.List;
import com.iss.exchange.core.base.dto.BaseResponse;
import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.channel.entity.ExChannelFee;
import com.iss.exchange.core.channel.dto.ExChannelFeeDTO;
import com.iss.exchange.core.channel.entity.ExChannelFee;
public class ExChannelFeeResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;

	public ExChannelFeeResponse(BaseRequest request) {
		super(request);
	}
	private ExChannelFeeDTO exChannelFeeDTO = new ExChannelFeeDTO();

	public ExChannelFeeDTO getExChannelFeeDTO() {
		return exChannelFeeDTO;
	}
	public void setExChannelFeeDTO(ExChannelFeeDTO exChannelFeeDTO) {
		this.exChannelFeeDTO = exChannelFeeDTO;
	}
}