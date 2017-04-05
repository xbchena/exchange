package com.iss.exchange.core.pay.dto.request;

import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;
import io.swagger.annotations.ApiModelProperty;
import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.pay.entity.ExRecBatchInstructionOut;
public class ExRecBatchInstructionOutRequest extends BaseRequest{

	private static final long serialVersionUID = 1L;

	private ExRecBatchInstructionOut ExRecBatchInstructionOut = new ExRecBatchInstructionOut();

	private BigInteger ExRecBatchInstructionOutID;

	private List<BigInteger> ExRecBatchInstructionOutIDList;

	private List<? extends ExRecBatchInstructionOut> ExRecBatchInstructionOutList = new ArrayList<ExRecBatchInstructionOut>();

	public List<? extends ExRecBatchInstructionOut> getExRecBatchInstructionOutList() {
		return ExRecBatchInstructionOutList;
	}
	public void setExRecBatchInstructionOutList(List<? extends ExRecBatchInstructionOut> ExRecBatchInstructionOutList) {
		this.ExRecBatchInstructionOutList = ExRecBatchInstructionOutList;
	}
	public ExRecBatchInstructionOut getExRecBatchInstructionOut() {
		return ExRecBatchInstructionOut;
	}
	public void setExRecBatchInstructionOut(ExRecBatchInstructionOut ExRecBatchInstructionOut) {
		this.ExRecBatchInstructionOut = ExRecBatchInstructionOut;
	}
	public BigInteger getExRecBatchInstructionOutID() {
		return ExRecBatchInstructionOutID;
	}
	public void setEdgeTransID(BigInteger ExRecBatchInstructionOutID) {
		this.ExRecBatchInstructionOutID = ExRecBatchInstructionOutID;
	}
	public List<BigInteger> getExRecBatchInstructionOutIDList() {
		return ExRecBatchInstructionOutIDList;
	}
	public void setExRecBatchInstructionOutIDList(List<BigInteger> ExRecBatchInstructionOutIDList) {
		this.ExRecBatchInstructionOutIDList = ExRecBatchInstructionOutIDList;
	}
}