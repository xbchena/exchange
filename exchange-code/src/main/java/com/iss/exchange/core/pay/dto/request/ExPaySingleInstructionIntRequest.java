package com.iss.exchange.core.pay.dto.request;

import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;
import io.swagger.annotations.ApiModelProperty;
import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.pay.entity.ExPaySingleInstructionInt;
public class ExPaySingleInstructionIntRequest extends BaseRequest{

	private static final long serialVersionUID = 1L;

	private ExPaySingleInstructionInt ExPaySingleInstructionInt = new ExPaySingleInstructionInt();

	private BigInteger ExPaySingleInstructionIntID;

	private List<BigInteger> ExPaySingleInstructionIntIDList;

	private List<? extends ExPaySingleInstructionInt> ExPaySingleInstructionIntList = new ArrayList<ExPaySingleInstructionInt>();

	public List<? extends ExPaySingleInstructionInt> getExPaySingleInstructionIntList() {
		return ExPaySingleInstructionIntList;
	}
	public void setExPaySingleInstructionIntList(List<? extends ExPaySingleInstructionInt> ExPaySingleInstructionIntList) {
		this.ExPaySingleInstructionIntList = ExPaySingleInstructionIntList;
	}
	public ExPaySingleInstructionInt getExPaySingleInstructionInt() {
		return ExPaySingleInstructionInt;
	}
	public void setExPaySingleInstructionInt(ExPaySingleInstructionInt ExPaySingleInstructionInt) {
		this.ExPaySingleInstructionInt = ExPaySingleInstructionInt;
	}
	public BigInteger getExPaySingleInstructionIntID() {
		return ExPaySingleInstructionIntID;
	}
	public void setEdgeTransID(BigInteger ExPaySingleInstructionIntID) {
		this.ExPaySingleInstructionIntID = ExPaySingleInstructionIntID;
	}
	public List<BigInteger> getExPaySingleInstructionIntIDList() {
		return ExPaySingleInstructionIntIDList;
	}
	public void setExPaySingleInstructionIntIDList(List<BigInteger> ExPaySingleInstructionIntIDList) {
		this.ExPaySingleInstructionIntIDList = ExPaySingleInstructionIntIDList;
	}
}