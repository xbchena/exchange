package com.iss.exchange.core.rec.dto.request;

import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;
import io.swagger.annotations.ApiModelProperty;
import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.rec.entity.ExRecSingleInstructionOut;
public class ExRecSingleInstructionOutRequest extends BaseRequest{

	private static final long serialVersionUID = 1L;

	private ExRecSingleInstructionOut ExRecSingleInstructionOut = new ExRecSingleInstructionOut();

	private BigInteger ExRecSingleInstructionOutID;

	private List<BigInteger> ExRecSingleInstructionOutIDList;

	private List<? extends ExRecSingleInstructionOut> ExRecSingleInstructionOutList = new ArrayList<ExRecSingleInstructionOut>();

	public List<? extends ExRecSingleInstructionOut> getExRecSingleInstructionOutList() {
		return ExRecSingleInstructionOutList;
	}
	public void setExRecSingleInstructionOutList(List<? extends ExRecSingleInstructionOut> ExRecSingleInstructionOutList) {
		this.ExRecSingleInstructionOutList = ExRecSingleInstructionOutList;
	}
	public ExRecSingleInstructionOut getExRecSingleInstructionOut() {
		return ExRecSingleInstructionOut;
	}
	public void setExRecSingleInstructionOut(ExRecSingleInstructionOut ExRecSingleInstructionOut) {
		this.ExRecSingleInstructionOut = ExRecSingleInstructionOut;
	}
	public BigInteger getExRecSingleInstructionOutID() {
		return ExRecSingleInstructionOutID;
	}
	public void setEdgeTransID(BigInteger ExRecSingleInstructionOutID) {
		this.ExRecSingleInstructionOutID = ExRecSingleInstructionOutID;
	}
	public List<BigInteger> getExRecSingleInstructionOutIDList() {
		return ExRecSingleInstructionOutIDList;
	}
	public void setExRecSingleInstructionOutIDList(List<BigInteger> ExRecSingleInstructionOutIDList) {
		this.ExRecSingleInstructionOutIDList = ExRecSingleInstructionOutIDList;
	}
}