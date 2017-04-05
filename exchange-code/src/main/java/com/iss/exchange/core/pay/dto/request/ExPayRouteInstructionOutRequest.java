package com.iss.exchange.core.pay.dto.request;

import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;
import io.swagger.annotations.ApiModelProperty;
import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.pay.entity.ExPayRouteInstructionOut;
public class ExPayRouteInstructionOutRequest extends BaseRequest{

	private static final long serialVersionUID = 1L;

	private ExPayRouteInstructionOut ExPayRouteInstructionOut = new ExPayRouteInstructionOut();

	private BigInteger ExPayRouteInstructionOutID;

	private List<BigInteger> ExPayRouteInstructionOutIDList;

	private List<? extends ExPayRouteInstructionOut> ExPayRouteInstructionOutList = new ArrayList<ExPayRouteInstructionOut>();

	public List<? extends ExPayRouteInstructionOut> getExPayRouteInstructionOutList() {
		return ExPayRouteInstructionOutList;
	}
	public void setExPayRouteInstructionOutList(List<? extends ExPayRouteInstructionOut> ExPayRouteInstructionOutList) {
		this.ExPayRouteInstructionOutList = ExPayRouteInstructionOutList;
	}
	public ExPayRouteInstructionOut getExPayRouteInstructionOut() {
		return ExPayRouteInstructionOut;
	}
	public void setExPayRouteInstructionOut(ExPayRouteInstructionOut ExPayRouteInstructionOut) {
		this.ExPayRouteInstructionOut = ExPayRouteInstructionOut;
	}
	public BigInteger getExPayRouteInstructionOutID() {
		return ExPayRouteInstructionOutID;
	}
	public void setEdgeTransID(BigInteger ExPayRouteInstructionOutID) {
		this.ExPayRouteInstructionOutID = ExPayRouteInstructionOutID;
	}
	public List<BigInteger> getExPayRouteInstructionOutIDList() {
		return ExPayRouteInstructionOutIDList;
	}
	public void setExPayRouteInstructionOutIDList(List<BigInteger> ExPayRouteInstructionOutIDList) {
		this.ExPayRouteInstructionOutIDList = ExPayRouteInstructionOutIDList;
	}
}