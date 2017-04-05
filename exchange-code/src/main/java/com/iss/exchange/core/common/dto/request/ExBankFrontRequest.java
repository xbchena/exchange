package com.iss.exchange.core.common.dto.request;

import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;
import io.swagger.annotations.ApiModelProperty;
import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.common.entity.ExBankFront;
public class ExBankFrontRequest extends BaseRequest{

	private static final long serialVersionUID = 1L;

	private ExBankFront ExBankFront = new ExBankFront();

	private BigInteger ExBankFrontID;

	private List<BigInteger> ExBankFrontIDList;

	private List<? extends ExBankFront> ExBankFrontList = new ArrayList<ExBankFront>();

	public List<? extends ExBankFront> getExBankFrontList() {
		return ExBankFrontList;
	}
	public void setExBankFrontList(List<? extends ExBankFront> ExBankFrontList) {
		this.ExBankFrontList = ExBankFrontList;
	}
	public ExBankFront getExBankFront() {
		return ExBankFront;
	}
	public void setExBankFront(ExBankFront ExBankFront) {
		this.ExBankFront = ExBankFront;
	}
	public BigInteger getExBankFrontID() {
		return ExBankFrontID;
	}
	public void setEdgeTransID(BigInteger ExBankFrontID) {
		this.ExBankFrontID = ExBankFrontID;
	}
	public List<BigInteger> getExBankFrontIDList() {
		return ExBankFrontIDList;
	}
	public void setExBankFrontIDList(List<BigInteger> ExBankFrontIDList) {
		this.ExBankFrontIDList = ExBankFrontIDList;
	}
}