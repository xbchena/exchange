package com.iss.exchange.core.route.dto.request;

import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;
import io.swagger.annotations.ApiModelProperty;
import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.route.entity.ExRouteDynInfo;
public class ExRouteDynInfoRequest extends BaseRequest{

	private static final long serialVersionUID = 1L;

	private ExRouteDynInfo ExRouteDynInfo = new ExRouteDynInfo();

	private BigInteger ExRouteDynInfoID;

	private List<BigInteger> ExRouteDynInfoIDList;

	private List<? extends ExRouteDynInfo> ExRouteDynInfoList = new ArrayList<ExRouteDynInfo>();

	public List<? extends ExRouteDynInfo> getExRouteDynInfoList() {
		return ExRouteDynInfoList;
	}
	public void setExRouteDynInfoList(List<? extends ExRouteDynInfo> ExRouteDynInfoList) {
		this.ExRouteDynInfoList = ExRouteDynInfoList;
	}
	public ExRouteDynInfo getExRouteDynInfo() {
		return ExRouteDynInfo;
	}
	public void setExRouteDynInfo(ExRouteDynInfo ExRouteDynInfo) {
		this.ExRouteDynInfo = ExRouteDynInfo;
	}
	public BigInteger getExRouteDynInfoID() {
		return ExRouteDynInfoID;
	}
	public void setEdgeTransID(BigInteger ExRouteDynInfoID) {
		this.ExRouteDynInfoID = ExRouteDynInfoID;
	}
	public List<BigInteger> getExRouteDynInfoIDList() {
		return ExRouteDynInfoIDList;
	}
	public void setExRouteDynInfoIDList(List<BigInteger> ExRouteDynInfoIDList) {
		this.ExRouteDynInfoIDList = ExRouteDynInfoIDList;
	}
}