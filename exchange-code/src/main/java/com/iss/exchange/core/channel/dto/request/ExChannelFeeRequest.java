package com.iss.exchange.core.channel.dto.request;

import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;
import io.swagger.annotations.ApiModelProperty;
import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.channel.entity.ExChannelFee;
public class ExChannelFeeRequest extends BaseRequest{

	private static final long serialVersionUID = 1L;

	private ExChannelFee ExChannelFee = new ExChannelFee();

	private BigInteger ExChannelFeeID;

	private List<BigInteger> ExChannelFeeIDList;

	private List<? extends ExChannelFee> ExChannelFeeList = new ArrayList<ExChannelFee>();

	public List<? extends ExChannelFee> getExChannelFeeList() {
		return ExChannelFeeList;
	}
	public void setExChannelFeeList(List<? extends ExChannelFee> ExChannelFeeList) {
		this.ExChannelFeeList = ExChannelFeeList;
	}
	public ExChannelFee getExChannelFee() {
		return ExChannelFee;
	}
	public void setExChannelFee(ExChannelFee ExChannelFee) {
		this.ExChannelFee = ExChannelFee;
	}
	public BigInteger getExChannelFeeID() {
		return ExChannelFeeID;
	}
	public void setEdgeTransID(BigInteger ExChannelFeeID) {
		this.ExChannelFeeID = ExChannelFeeID;
	}
	public List<BigInteger> getExChannelFeeIDList() {
		return ExChannelFeeIDList;
	}
	public void setExChannelFeeIDList(List<BigInteger> ExChannelFeeIDList) {
		this.ExChannelFeeIDList = ExChannelFeeIDList;
	}
}