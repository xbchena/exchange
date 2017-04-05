package com.iss.exchange.core.channel.dto.response;

import java.util.List;

import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.base.dto.response.BasePageListResponse;
import com.iss.exchange.core.channel.dto.ExChannelFeeDetailDTO;
import com.iss.exchange.core.channel.entity.ExChannelFeeDetail;
public class ExChannelFeeDetailPageListResponse extends BasePageListResponse{

	private static final long serialVersionUID = 1L;

	public ExChannelFeeDetailPageListResponse(BasePageListRequest request) {
		super(request);
	}
	private List<? extends ExChannelFeeDetail> exChannelFeeDetailDTOList;
	public List<? extends ExChannelFeeDetail> getExChannelFeeDetailDTOList() {
		return exChannelFeeDetailDTOList;
	}
	public void setExChannelFeeDetailDTOList(List<? extends ExChannelFeeDetailDTO> exChannelFeeDetailDTOList) {
		this.exChannelFeeDetailDTOList = exChannelFeeDetailDTOList;
	}
}