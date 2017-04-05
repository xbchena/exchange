package com.iss.exchange.core.rec.dto.request;

import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;
import io.swagger.annotations.ApiModelProperty;
import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.rec.entity.ExRecRouteInstructionIntDetail;
public class ExRecRouteInstructionIntDetailRequest extends BaseRequest{

	private static final long serialVersionUID = 1L;

	private ExRecRouteInstructionIntDetail ExRecRouteInstructionIntDetail = new ExRecRouteInstructionIntDetail();

	private BigInteger ExRecRouteInstructionIntDetailID;

	private List<BigInteger> ExRecRouteInstructionIntDetailIDList;

	private List<? extends ExRecRouteInstructionIntDetail> ExRecRouteInstructionIntDetailList = new ArrayList<ExRecRouteInstructionIntDetail>();

	public List<? extends ExRecRouteInstructionIntDetail> getExRecRouteInstructionIntDetailList() {
		return ExRecRouteInstructionIntDetailList;
	}
	public void setExRecRouteInstructionIntDetailList(List<? extends ExRecRouteInstructionIntDetail> ExRecRouteInstructionIntDetailList) {
		this.ExRecRouteInstructionIntDetailList = ExRecRouteInstructionIntDetailList;
	}
	public ExRecRouteInstructionIntDetail getExRecRouteInstructionIntDetail() {
		return ExRecRouteInstructionIntDetail;
	}
	public void setExRecRouteInstructionIntDetail(ExRecRouteInstructionIntDetail ExRecRouteInstructionIntDetail) {
		this.ExRecRouteInstructionIntDetail = ExRecRouteInstructionIntDetail;
	}
	public BigInteger getExRecRouteInstructionIntDetailID() {
		return ExRecRouteInstructionIntDetailID;
	}
	public void setEdgeTransID(BigInteger ExRecRouteInstructionIntDetailID) {
		this.ExRecRouteInstructionIntDetailID = ExRecRouteInstructionIntDetailID;
	}
	public List<BigInteger> getExRecRouteInstructionIntDetailIDList() {
		return ExRecRouteInstructionIntDetailIDList;
	}
	public void setExRecRouteInstructionIntDetailIDList(List<BigInteger> ExRecRouteInstructionIntDetailIDList) {
		this.ExRecRouteInstructionIntDetailIDList = ExRecRouteInstructionIntDetailIDList;
	}
}