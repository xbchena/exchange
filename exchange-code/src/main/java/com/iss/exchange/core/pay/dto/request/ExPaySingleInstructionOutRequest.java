package com.iss.exchange.core.pay.dto.request;

import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;
import io.swagger.annotations.ApiModelProperty;
import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.pay.entity.ExPaySingleInstructionOut;
public class ExPaySingleInstructionOutRequest extends BaseRequest{

	private static final long serialVersionUID = 1L;

	private ExPaySingleInstructionOut ExPaySingleInstructionOut = new ExPaySingleInstructionOut();

	private BigInteger ExPaySingleInstructionOutID;

	private List<BigInteger> ExPaySingleInstructionOutIDList;

	private List<? extends ExPaySingleInstructionOut> ExPaySingleInstructionOutList = new ArrayList<ExPaySingleInstructionOut>();

	public List<? extends ExPaySingleInstructionOut> getExPaySingleInstructionOutList() {
		return ExPaySingleInstructionOutList;
	}
	public void setExPaySingleInstructionOutList(List<? extends ExPaySingleInstructionOut> ExPaySingleInstructionOutList) {
		this.ExPaySingleInstructionOutList = ExPaySingleInstructionOutList;
	}
	public ExPaySingleInstructionOut getExPaySingleInstructionOut() {
		return ExPaySingleInstructionOut;
	}
	public void setExPaySingleInstructionOut(ExPaySingleInstructionOut ExPaySingleInstructionOut) {
		this.ExPaySingleInstructionOut = ExPaySingleInstructionOut;
	}
	public BigInteger getExPaySingleInstructionOutID() {
		return ExPaySingleInstructionOutID;
	}
	public void setEdgeTransID(BigInteger ExPaySingleInstructionOutID) {
		this.ExPaySingleInstructionOutID = ExPaySingleInstructionOutID;
	}
	public List<BigInteger> getExPaySingleInstructionOutIDList() {
		return ExPaySingleInstructionOutIDList;
	}
	public void setExPaySingleInstructionOutIDList(List<BigInteger> ExPaySingleInstructionOutIDList) {
		this.ExPaySingleInstructionOutIDList = ExPaySingleInstructionOutIDList;
	}
}