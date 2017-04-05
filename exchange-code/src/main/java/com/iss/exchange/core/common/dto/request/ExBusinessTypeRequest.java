package com.iss.exchange.core.common.dto.request;

import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;
import io.swagger.annotations.ApiModelProperty;
import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.common.entity.ExBusinessType;
public class ExBusinessTypeRequest extends BaseRequest{

	private static final long serialVersionUID = 1L;

	private ExBusinessType ExBusinessType = new ExBusinessType();

	private BigInteger ExBusinessTypeID;

	private List<BigInteger> ExBusinessTypeIDList;

	private List<? extends ExBusinessType> ExBusinessTypeList = new ArrayList<ExBusinessType>();

	public List<? extends ExBusinessType> getExBusinessTypeList() {
		return ExBusinessTypeList;
	}
	public void setExBusinessTypeList(List<? extends ExBusinessType> ExBusinessTypeList) {
		this.ExBusinessTypeList = ExBusinessTypeList;
	}
	public ExBusinessType getExBusinessType() {
		return ExBusinessType;
	}
	public void setExBusinessType(ExBusinessType ExBusinessType) {
		this.ExBusinessType = ExBusinessType;
	}
	public BigInteger getExBusinessTypeID() {
		return ExBusinessTypeID;
	}
	public void setEdgeTransID(BigInteger ExBusinessTypeID) {
		this.ExBusinessTypeID = ExBusinessTypeID;
	}
	public List<BigInteger> getExBusinessTypeIDList() {
		return ExBusinessTypeIDList;
	}
	public void setExBusinessTypeIDList(List<BigInteger> ExBusinessTypeIDList) {
		this.ExBusinessTypeIDList = ExBusinessTypeIDList;
	}
}