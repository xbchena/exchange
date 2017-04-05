package com.iss.exchange.core.channel.dto.request;

import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;
import io.swagger.annotations.ApiModelProperty;
import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.channel.entity.ExChannelFeeDetail;
public class ExChannelFeeDetailRequest extends BaseRequest{

	private static final long serialVersionUID = 1L;

	private ExChannelFeeDetail ExChannelFeeDetail = new ExChannelFeeDetail();

	private BigInteger ExChannelFeeDetailID;

	private List<BigInteger> ExChannelFeeDetailIDList;

	private List<? extends ExChannelFeeDetail> ExChannelFeeDetailList = new ArrayList<ExChannelFeeDetail>();

	public List<? extends ExChannelFeeDetail> getExChannelFeeDetailList() {
		return ExChannelFeeDetailList;
	}
	public void setExChannelFeeDetailList(List<? extends ExChannelFeeDetail> ExChannelFeeDetailList) {
		this.ExChannelFeeDetailList = ExChannelFeeDetailList;
	}
	public ExChannelFeeDetail getExChannelFeeDetail() {
		return ExChannelFeeDetail;
	}
	public void setExChannelFeeDetail(ExChannelFeeDetail ExChannelFeeDetail) {
		this.ExChannelFeeDetail = ExChannelFeeDetail;
	}
	public BigInteger getExChannelFeeDetailID() {
		return ExChannelFeeDetailID;
	}
	public void setEdgeTransID(BigInteger ExChannelFeeDetailID) {
		this.ExChannelFeeDetailID = ExChannelFeeDetailID;
	}
	public List<BigInteger> getExChannelFeeDetailIDList() {
		return ExChannelFeeDetailIDList;
	}
	public void setExChannelFeeDetailIDList(List<BigInteger> ExChannelFeeDetailIDList) {
		this.ExChannelFeeDetailIDList = ExChannelFeeDetailIDList;
	}
}