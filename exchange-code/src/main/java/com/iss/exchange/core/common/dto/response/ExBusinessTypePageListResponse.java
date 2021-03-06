package com.iss.exchange.core.common.dto.response;

import java.util.List;

import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.base.dto.response.BasePageListResponse;
import com.iss.exchange.core.common.dto.ExBusinessTypeDTO;
import com.iss.exchange.core.common.entity.ExBusinessType;
public class ExBusinessTypePageListResponse extends BasePageListResponse{

	private static final long serialVersionUID = 1L;

	public ExBusinessTypePageListResponse(BasePageListRequest request) {
		super(request);
	}
	private List<? extends ExBusinessType> exBusinessTypeDTOList;
	public List<? extends ExBusinessType> getExBusinessTypeDTOList() {
		return exBusinessTypeDTOList;
	}
	public void setExBusinessTypeDTOList(List<? extends ExBusinessTypeDTO> exBusinessTypeDTOList) {
		this.exBusinessTypeDTOList = exBusinessTypeDTOList;
	}
}