package com.iss.exchange.core.pay.dto.request;

import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;
import io.swagger.annotations.ApiModelProperty;
import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.pay.entity.ExPayBatchInstructionOut;
public class ExPayBatchInstructionOutRequest extends BaseRequest{

	private static final long serialVersionUID = 1L;

	private ExPayBatchInstructionOut ExPayBatchInstructionOut = new ExPayBatchInstructionOut();

	private BigInteger ExPayBatchInstructionOutID;

	private List<BigInteger> ExPayBatchInstructionOutIDList;

	private List<? extends ExPayBatchInstructionOut> ExPayBatchInstructionOutList = new ArrayList<ExPayBatchInstructionOut>();

	public List<? extends ExPayBatchInstructionOut> getExPayBatchInstructionOutList() {
		return ExPayBatchInstructionOutList;
	}
	public void setExPayBatchInstructionOutList(List<? extends ExPayBatchInstructionOut> ExPayBatchInstructionOutList) {
		this.ExPayBatchInstructionOutList = ExPayBatchInstructionOutList;
	}
	public ExPayBatchInstructionOut getExPayBatchInstructionOut() {
		return ExPayBatchInstructionOut;
	}
	public void setExPayBatchInstructionOut(ExPayBatchInstructionOut ExPayBatchInstructionOut) {
		this.ExPayBatchInstructionOut = ExPayBatchInstructionOut;
	}
	public BigInteger getExPayBatchInstructionOutID() {
		return ExPayBatchInstructionOutID;
	}
	public void setEdgeTransID(BigInteger ExPayBatchInstructionOutID) {
		this.ExPayBatchInstructionOutID = ExPayBatchInstructionOutID;
	}
	public List<BigInteger> getExPayBatchInstructionOutIDList() {
		return ExPayBatchInstructionOutIDList;
	}
	public void setExPayBatchInstructionOutIDList(List<BigInteger> ExPayBatchInstructionOutIDList) {
		this.ExPayBatchInstructionOutIDList = ExPayBatchInstructionOutIDList;
	}
}