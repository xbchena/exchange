package com.iss.exchange.core.common.dto.request;

import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;
import io.swagger.annotations.ApiModelProperty;
import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.common.entity.ExBankType;
public class ExBankTypeRequest extends BaseRequest{

	private static final long serialVersionUID = 1L;

	private ExBankType ExBankType = new ExBankType();

	private BigInteger ExBankTypeID;

	private List<BigInteger> ExBankTypeIDList;

	private List<? extends ExBankType> ExBankTypeList = new ArrayList<ExBankType>();

	public List<? extends ExBankType> getExBankTypeList() {
		return ExBankTypeList;
	}
	public void setExBankTypeList(List<? extends ExBankType> ExBankTypeList) {
		this.ExBankTypeList = ExBankTypeList;
	}
	public ExBankType getExBankType() {
		return ExBankType;
	}
	public void setExBankType(ExBankType ExBankType) {
		this.ExBankType = ExBankType;
	}
	public BigInteger getExBankTypeID() {
		return ExBankTypeID;
	}
	public void setEdgeTransID(BigInteger ExBankTypeID) {
		this.ExBankTypeID = ExBankTypeID;
	}
	public List<BigInteger> getExBankTypeIDList() {
		return ExBankTypeIDList;
	}
	public void setExBankTypeIDList(List<BigInteger> ExBankTypeIDList) {
		this.ExBankTypeIDList = ExBankTypeIDList;
	}
}