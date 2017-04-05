package com.iss.exchange.core.pay.dto.request;

import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;
import io.swagger.annotations.ApiModelProperty;
import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.pay.entity.ExRecBatchInstructionInt;
public class ExRecBatchInstructionIntRequest extends BaseRequest{

	private static final long serialVersionUID = 1L;

	private ExRecBatchInstructionInt ExRecBatchInstructionInt = new ExRecBatchInstructionInt();

	private BigInteger ExRecBatchInstructionIntID;

	private List<BigInteger> ExRecBatchInstructionIntIDList;

	private List<? extends ExRecBatchInstructionInt> ExRecBatchInstructionIntList = new ArrayList<ExRecBatchInstructionInt>();

	public List<? extends ExRecBatchInstructionInt> getExRecBatchInstructionIntList() {
		return ExRecBatchInstructionIntList;
	}
	public void setExRecBatchInstructionIntList(List<? extends ExRecBatchInstructionInt> ExRecBatchInstructionIntList) {
		this.ExRecBatchInstructionIntList = ExRecBatchInstructionIntList;
	}
	public ExRecBatchInstructionInt getExRecBatchInstructionInt() {
		return ExRecBatchInstructionInt;
	}
	public void setExRecBatchInstructionInt(ExRecBatchInstructionInt ExRecBatchInstructionInt) {
		this.ExRecBatchInstructionInt = ExRecBatchInstructionInt;
	}
	public BigInteger getExRecBatchInstructionIntID() {
		return ExRecBatchInstructionIntID;
	}
	public void setEdgeTransID(BigInteger ExRecBatchInstructionIntID) {
		this.ExRecBatchInstructionIntID = ExRecBatchInstructionIntID;
	}
	public List<BigInteger> getExRecBatchInstructionIntIDList() {
		return ExRecBatchInstructionIntIDList;
	}
	public void setExRecBatchInstructionIntIDList(List<BigInteger> ExRecBatchInstructionIntIDList) {
		this.ExRecBatchInstructionIntIDList = ExRecBatchInstructionIntIDList;
	}
}