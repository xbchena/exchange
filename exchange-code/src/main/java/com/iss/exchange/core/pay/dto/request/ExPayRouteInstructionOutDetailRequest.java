package com.iss.exchange.core.pay.dto.request;

import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;
import io.swagger.annotations.ApiModelProperty;
import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.pay.entity.ExPayRouteInstructionOutDetail;
public class ExPayRouteInstructionOutDetailRequest extends BaseRequest{

	private static final long serialVersionUID = 1L;

	private ExPayRouteInstructionOutDetail ExPayRouteInstructionOutDetail = new ExPayRouteInstructionOutDetail();

	private BigInteger ExPayRouteInstructionOutDetailID;

	private List<BigInteger> ExPayRouteInstructionOutDetailIDList;

	private List<? extends ExPayRouteInstructionOutDetail> ExPayRouteInstructionOutDetailList = new ArrayList<ExPayRouteInstructionOutDetail>();

	public List<? extends ExPayRouteInstructionOutDetail> getExPayRouteInstructionOutDetailList() {
		return ExPayRouteInstructionOutDetailList;
	}
	public void setExPayRouteInstructionOutDetailList(List<? extends ExPayRouteInstructionOutDetail> ExPayRouteInstructionOutDetailList) {
		this.ExPayRouteInstructionOutDetailList = ExPayRouteInstructionOutDetailList;
	}
	public ExPayRouteInstructionOutDetail getExPayRouteInstructionOutDetail() {
		return ExPayRouteInstructionOutDetail;
	}
	public void setExPayRouteInstructionOutDetail(ExPayRouteInstructionOutDetail ExPayRouteInstructionOutDetail) {
		this.ExPayRouteInstructionOutDetail = ExPayRouteInstructionOutDetail;
	}
	public BigInteger getExPayRouteInstructionOutDetailID() {
		return ExPayRouteInstructionOutDetailID;
	}
	public void setEdgeTransID(BigInteger ExPayRouteInstructionOutDetailID) {
		this.ExPayRouteInstructionOutDetailID = ExPayRouteInstructionOutDetailID;
	}
	public List<BigInteger> getExPayRouteInstructionOutDetailIDList() {
		return ExPayRouteInstructionOutDetailIDList;
	}
	public void setExPayRouteInstructionOutDetailIDList(List<BigInteger> ExPayRouteInstructionOutDetailIDList) {
		this.ExPayRouteInstructionOutDetailIDList = ExPayRouteInstructionOutDetailIDList;
	}
}