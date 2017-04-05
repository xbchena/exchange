package com.iss.exchange.core.common.dto.request;

import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;
import io.swagger.annotations.ApiModelProperty;
import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.common.entity.ExAgency;
public class ExAgencyRequest extends BaseRequest{

	private static final long serialVersionUID = 1L;

	private ExAgency ExAgency = new ExAgency();

	private BigInteger ExAgencyID;

	private List<BigInteger> ExAgencyIDList;

	private List<? extends ExAgency> ExAgencyList = new ArrayList<ExAgency>();

	public List<? extends ExAgency> getExAgencyList() {
		return ExAgencyList;
	}
	public void setExAgencyList(List<? extends ExAgency> ExAgencyList) {
		this.ExAgencyList = ExAgencyList;
	}
	public ExAgency getExAgency() {
		return ExAgency;
	}
	public void setExAgency(ExAgency ExAgency) {
		this.ExAgency = ExAgency;
	}
	public BigInteger getExAgencyID() {
		return ExAgencyID;
	}
	public void setEdgeTransID(BigInteger ExAgencyID) {
		this.ExAgencyID = ExAgencyID;
	}
	public List<BigInteger> getExAgencyIDList() {
		return ExAgencyIDList;
	}
	public void setExAgencyIDList(List<BigInteger> ExAgencyIDList) {
		this.ExAgencyIDList = ExAgencyIDList;
	}
}