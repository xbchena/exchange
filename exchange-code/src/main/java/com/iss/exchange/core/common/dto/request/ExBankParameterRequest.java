package com.iss.exchange.core.common.dto.request;

import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;
import io.swagger.annotations.ApiModelProperty;
import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.common.entity.ExBankParameter;
public class ExBankParameterRequest extends BaseRequest{

	private static final long serialVersionUID = 1L;

	private ExBankParameter ExBankParameter = new ExBankParameter();

	private BigInteger ExBankParameterID;

	private List<BigInteger> ExBankParameterIDList;

	private List<? extends ExBankParameter> ExBankParameterList = new ArrayList<ExBankParameter>();

	public List<? extends ExBankParameter> getExBankParameterList() {
		return ExBankParameterList;
	}
	public void setExBankParameterList(List<? extends ExBankParameter> ExBankParameterList) {
		this.ExBankParameterList = ExBankParameterList;
	}
	public ExBankParameter getExBankParameter() {
		return ExBankParameter;
	}
	public void setExBankParameter(ExBankParameter ExBankParameter) {
		this.ExBankParameter = ExBankParameter;
	}
	public BigInteger getExBankParameterID() {
		return ExBankParameterID;
	}
	public void setEdgeTransID(BigInteger ExBankParameterID) {
		this.ExBankParameterID = ExBankParameterID;
	}
	public List<BigInteger> getExBankParameterIDList() {
		return ExBankParameterIDList;
	}
	public void setExBankParameterIDList(List<BigInteger> ExBankParameterIDList) {
		this.ExBankParameterIDList = ExBankParameterIDList;
	}
}