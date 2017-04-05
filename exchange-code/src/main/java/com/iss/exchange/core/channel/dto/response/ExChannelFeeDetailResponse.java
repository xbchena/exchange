package com.iss.exchange.core.channel.dto.response;

import java.util.List;
import com.iss.exchange.core.base.dto.BaseResponse;
import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.channel.entity.ExChannelFeeDetail;
import com.iss.exchange.core.channel.dto.ExChannelFeeDetailDTO;
import com.iss.exchange.core.channel.entity.ExChannelFeeDetail;
public class ExChannelFeeDetailResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;

	public ExChannelFeeDetailResponse(BaseRequest request) {
		super(request);
	}
	private ExChannelFeeDetailDTO exChannelFeeDetailDTO = new ExChannelFeeDetailDTO();

	public ExChannelFeeDetailDTO getExChannelFeeDetailDTO() {
		return exChannelFeeDetailDTO;
	}
	public void setExChannelFeeDetailDTO(ExChannelFeeDetailDTO exChannelFeeDetailDTO) {
		this.exChannelFeeDetailDTO = exChannelFeeDetailDTO;
	}
}