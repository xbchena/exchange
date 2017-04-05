package com.iss.exchange.core.pay.dto.request;

import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;
import io.swagger.annotations.ApiModelProperty;
import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.pay.entity.ExPayRouteInstructionIntDetail;
public class ExPayRouteInstructionIntDetailRequest extends BaseRequest{

	private static final long serialVersionUID = 1L;

	private ExPayRouteInstructionIntDetail ExPayRouteInstructionIntDetail = new ExPayRouteInstructionIntDetail();

	private BigInteger ExPayRouteInstructionIntDetailID;

	private List<BigInteger> ExPayRouteInstructionIntDetailIDList;

	private List<? extends ExPayRouteInstructionIntDetail> ExPayRouteInstructionIntDetailList = new ArrayList<ExPayRouteInstructionIntDetail>();

	public List<? extends ExPayRouteInstructionIntDetail> getExPayRouteInstructionIntDetailList() {
		return ExPayRouteInstructionIntDetailList;
	}
	public void setExPayRouteInstructionIntDetailList(List<? extends ExPayRouteInstructionIntDetail> ExPayRouteInstructionIntDetailList) {
		this.ExPayRouteInstructionIntDetailList = ExPayRouteInstructionIntDetailList;
	}
	public ExPayRouteInstructionIntDetail getExPayRouteInstructionIntDetail() {
		return ExPayRouteInstructionIntDetail;
	}
	public void setExPayRouteInstructionIntDetail(ExPayRouteInstructionIntDetail ExPayRouteInstructionIntDetail) {
		this.ExPayRouteInstructionIntDetail = ExPayRouteInstructionIntDetail;
	}
	public BigInteger getExPayRouteInstructionIntDetailID() {
		return ExPayRouteInstructionIntDetailID;
	}
	public void setEdgeTransID(BigInteger ExPayRouteInstructionIntDetailID) {
		this.ExPayRouteInstructionIntDetailID = ExPayRouteInstructionIntDetailID;
	}
	public List<BigInteger> getExPayRouteInstructionIntDetailIDList() {
		return ExPayRouteInstructionIntDetailIDList;
	}
	public void setExPayRouteInstructionIntDetailIDList(List<BigInteger> ExPayRouteInstructionIntDetailIDList) {
		this.ExPayRouteInstructionIntDetailIDList = ExPayRouteInstructionIntDetailIDList;
	}
}