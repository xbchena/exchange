package com.iss.exchange.core.route.dto.request;

import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;
import io.swagger.annotations.ApiModelProperty;
import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.route.entity.ExRouteStaticInfo;
public class ExRouteStaticInfoRequest extends BaseRequest{

	private static final long serialVersionUID = 1L;

	private ExRouteStaticInfo ExRouteStaticInfo = new ExRouteStaticInfo();

	private BigInteger ExRouteStaticInfoID;

	private List<BigInteger> ExRouteStaticInfoIDList;

	private List<? extends ExRouteStaticInfo> ExRouteStaticInfoList = new ArrayList<ExRouteStaticInfo>();

	public List<? extends ExRouteStaticInfo> getExRouteStaticInfoList() {
		return ExRouteStaticInfoList;
	}
	public void setExRouteStaticInfoList(List<? extends ExRouteStaticInfo> ExRouteStaticInfoList) {
		this.ExRouteStaticInfoList = ExRouteStaticInfoList;
	}
	public ExRouteStaticInfo getExRouteStaticInfo() {
		return ExRouteStaticInfo;
	}
	public void setExRouteStaticInfo(ExRouteStaticInfo ExRouteStaticInfo) {
		this.ExRouteStaticInfo = ExRouteStaticInfo;
	}
	public BigInteger getExRouteStaticInfoID() {
		return ExRouteStaticInfoID;
	}
	public void setEdgeTransID(BigInteger ExRouteStaticInfoID) {
		this.ExRouteStaticInfoID = ExRouteStaticInfoID;
	}
	public List<BigInteger> getExRouteStaticInfoIDList() {
		return ExRouteStaticInfoIDList;
	}
	public void setExRouteStaticInfoIDList(List<BigInteger> ExRouteStaticInfoIDList) {
		this.ExRouteStaticInfoIDList = ExRouteStaticInfoIDList;
	}
}