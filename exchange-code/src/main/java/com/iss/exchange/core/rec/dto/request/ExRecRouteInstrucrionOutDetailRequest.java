package com.iss.exchange.core.rec.dto.request;

import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;
import io.swagger.annotations.ApiModelProperty;
import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.rec.entity.ExRecRouteInstrucrionOutDetail;
public class ExRecRouteInstrucrionOutDetailRequest extends BaseRequest{

	private static final long serialVersionUID = 1L;

	private ExRecRouteInstrucrionOutDetail ExRecRouteInstrucrionOutDetail = new ExRecRouteInstrucrionOutDetail();

	private BigInteger ExRecRouteInstrucrionOutDetailID;

	private List<BigInteger> ExRecRouteInstrucrionOutDetailIDList;

	private List<? extends ExRecRouteInstrucrionOutDetail> ExRecRouteInstrucrionOutDetailList = new ArrayList<ExRecRouteInstrucrionOutDetail>();

	public List<? extends ExRecRouteInstrucrionOutDetail> getExRecRouteInstrucrionOutDetailList() {
		return ExRecRouteInstrucrionOutDetailList;
	}
	public void setExRecRouteInstrucrionOutDetailList(List<? extends ExRecRouteInstrucrionOutDetail> ExRecRouteInstrucrionOutDetailList) {
		this.ExRecRouteInstrucrionOutDetailList = ExRecRouteInstrucrionOutDetailList;
	}
	public ExRecRouteInstrucrionOutDetail getExRecRouteInstrucrionOutDetail() {
		return ExRecRouteInstrucrionOutDetail;
	}
	public void setExRecRouteInstrucrionOutDetail(ExRecRouteInstrucrionOutDetail ExRecRouteInstrucrionOutDetail) {
		this.ExRecRouteInstrucrionOutDetail = ExRecRouteInstrucrionOutDetail;
	}
	public BigInteger getExRecRouteInstrucrionOutDetailID() {
		return ExRecRouteInstrucrionOutDetailID;
	}
	public void setEdgeTransID(BigInteger ExRecRouteInstrucrionOutDetailID) {
		this.ExRecRouteInstrucrionOutDetailID = ExRecRouteInstrucrionOutDetailID;
	}
	public List<BigInteger> getExRecRouteInstrucrionOutDetailIDList() {
		return ExRecRouteInstrucrionOutDetailIDList;
	}
	public void setExRecRouteInstrucrionOutDetailIDList(List<BigInteger> ExRecRouteInstrucrionOutDetailIDList) {
		this.ExRecRouteInstrucrionOutDetailIDList = ExRecRouteInstrucrionOutDetailIDList;
	}
}