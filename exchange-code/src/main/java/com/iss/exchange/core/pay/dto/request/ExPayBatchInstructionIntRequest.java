package com.iss.exchange.core.pay.dto.request;

import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;
import io.swagger.annotations.ApiModelProperty;
import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.pay.entity.ExPayBatchInstructionInt;
public class ExPayBatchInstructionIntRequest extends BaseRequest{

	private static final long serialVersionUID = 1L;

	private ExPayBatchInstructionInt ExPayBatchInstructionInt = new ExPayBatchInstructionInt();

	private BigInteger ExPayBatchInstructionIntID;

	private List<BigInteger> ExPayBatchInstructionIntIDList;

	private List<? extends ExPayBatchInstructionInt> ExPayBatchInstructionIntList = new ArrayList<ExPayBatchInstructionInt>();

	public List<? extends ExPayBatchInstructionInt> getExPayBatchInstructionIntList() {
		return ExPayBatchInstructionIntList;
	}
	public void setExPayBatchInstructionIntList(List<? extends ExPayBatchInstructionInt> ExPayBatchInstructionIntList) {
		this.ExPayBatchInstructionIntList = ExPayBatchInstructionIntList;
	}
	public ExPayBatchInstructionInt getExPayBatchInstructionInt() {
		return ExPayBatchInstructionInt;
	}
	public void setExPayBatchInstructionInt(ExPayBatchInstructionInt ExPayBatchInstructionInt) {
		this.ExPayBatchInstructionInt = ExPayBatchInstructionInt;
	}
	public BigInteger getExPayBatchInstructionIntID() {
		return ExPayBatchInstructionIntID;
	}
	public void setEdgeTransID(BigInteger ExPayBatchInstructionIntID) {
		this.ExPayBatchInstructionIntID = ExPayBatchInstructionIntID;
	}
	public List<BigInteger> getExPayBatchInstructionIntIDList() {
		return ExPayBatchInstructionIntIDList;
	}
	public void setExPayBatchInstructionIntIDList(List<BigInteger> ExPayBatchInstructionIntIDList) {
		this.ExPayBatchInstructionIntIDList = ExPayBatchInstructionIntIDList;
	}
}