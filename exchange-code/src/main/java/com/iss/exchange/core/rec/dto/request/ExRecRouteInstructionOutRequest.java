package com.iss.exchange.core.rec.dto.request;

import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;
import io.swagger.annotations.ApiModelProperty;
import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.rec.entity.ExRecRouteInstructionOut;
public class ExRecRouteInstructionOutRequest extends BaseRequest{

	private static final long serialVersionUID = 1L;

	private ExRecRouteInstructionOut ExRecRouteInstructionOut = new ExRecRouteInstructionOut();

	private BigInteger ExRecRouteInstructionOutID;

	private List<BigInteger> ExRecRouteInstructionOutIDList;

	private List<? extends ExRecRouteInstructionOut> ExRecRouteInstructionOutList = new ArrayList<ExRecRouteInstructionOut>();

	public List<? extends ExRecRouteInstructionOut> getExRecRouteInstructionOutList() {
		return ExRecRouteInstructionOutList;
	}
	public void setExRecRouteInstructionOutList(List<? extends ExRecRouteInstructionOut> ExRecRouteInstructionOutList) {
		this.ExRecRouteInstructionOutList = ExRecRouteInstructionOutList;
	}
	public ExRecRouteInstructionOut getExRecRouteInstructionOut() {
		return ExRecRouteInstructionOut;
	}
	public void setExRecRouteInstructionOut(ExRecRouteInstructionOut ExRecRouteInstructionOut) {
		this.ExRecRouteInstructionOut = ExRecRouteInstructionOut;
	}
	public BigInteger getExRecRouteInstructionOutID() {
		return ExRecRouteInstructionOutID;
	}
	public void setEdgeTransID(BigInteger ExRecRouteInstructionOutID) {
		this.ExRecRouteInstructionOutID = ExRecRouteInstructionOutID;
	}
	public List<BigInteger> getExRecRouteInstructionOutIDList() {
		return ExRecRouteInstructionOutIDList;
	}
	public void setExRecRouteInstructionOutIDList(List<BigInteger> ExRecRouteInstructionOutIDList) {
		this.ExRecRouteInstructionOutIDList = ExRecRouteInstructionOutIDList;
	}
}