package com.iss.exchange.core.rec.dto.request;

import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;
import io.swagger.annotations.ApiModelProperty;
import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.rec.entity.ExRecSingleInstructionInt;
public class ExRecSingleInstructionIntRequest extends BaseRequest{

	private static final long serialVersionUID = 1L;

	private ExRecSingleInstructionInt ExRecSingleInstructionInt = new ExRecSingleInstructionInt();

	private BigInteger ExRecSingleInstructionIntID;

	private List<BigInteger> ExRecSingleInstructionIntIDList;

	private List<? extends ExRecSingleInstructionInt> ExRecSingleInstructionIntList = new ArrayList<ExRecSingleInstructionInt>();

	public List<? extends ExRecSingleInstructionInt> getExRecSingleInstructionIntList() {
		return ExRecSingleInstructionIntList;
	}
	public void setExRecSingleInstructionIntList(List<? extends ExRecSingleInstructionInt> ExRecSingleInstructionIntList) {
		this.ExRecSingleInstructionIntList = ExRecSingleInstructionIntList;
	}
	public ExRecSingleInstructionInt getExRecSingleInstructionInt() {
		return ExRecSingleInstructionInt;
	}
	public void setExRecSingleInstructionInt(ExRecSingleInstructionInt ExRecSingleInstructionInt) {
		this.ExRecSingleInstructionInt = ExRecSingleInstructionInt;
	}
	public BigInteger getExRecSingleInstructionIntID() {
		return ExRecSingleInstructionIntID;
	}
	public void setEdgeTransID(BigInteger ExRecSingleInstructionIntID) {
		this.ExRecSingleInstructionIntID = ExRecSingleInstructionIntID;
	}
	public List<BigInteger> getExRecSingleInstructionIntIDList() {
		return ExRecSingleInstructionIntIDList;
	}
	public void setExRecSingleInstructionIntIDList(List<BigInteger> ExRecSingleInstructionIntIDList) {
		this.ExRecSingleInstructionIntIDList = ExRecSingleInstructionIntIDList;
	}
}