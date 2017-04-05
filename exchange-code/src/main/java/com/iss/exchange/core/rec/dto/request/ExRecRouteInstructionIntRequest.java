package com.iss.exchange.core.rec.dto.request;

import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;
import io.swagger.annotations.ApiModelProperty;
import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.rec.entity.ExRecRouteInstructionInt;
public class ExRecRouteInstructionIntRequest extends BaseRequest{

	private static final long serialVersionUID = 1L;

	private ExRecRouteInstructionInt ExRecRouteInstructionInt = new ExRecRouteInstructionInt();

	private BigInteger ExRecRouteInstructionIntID;

	private List<BigInteger> ExRecRouteInstructionIntIDList;

	private List<? extends ExRecRouteInstructionInt> ExRecRouteInstructionIntList = new ArrayList<ExRecRouteInstructionInt>();

	public List<? extends ExRecRouteInstructionInt> getExRecRouteInstructionIntList() {
		return ExRecRouteInstructionIntList;
	}
	public void setExRecRouteInstructionIntList(List<? extends ExRecRouteInstructionInt> ExRecRouteInstructionIntList) {
		this.ExRecRouteInstructionIntList = ExRecRouteInstructionIntList;
	}
	public ExRecRouteInstructionInt getExRecRouteInstructionInt() {
		return ExRecRouteInstructionInt;
	}
	public void setExRecRouteInstructionInt(ExRecRouteInstructionInt ExRecRouteInstructionInt) {
		this.ExRecRouteInstructionInt = ExRecRouteInstructionInt;
	}
	public BigInteger getExRecRouteInstructionIntID() {
		return ExRecRouteInstructionIntID;
	}
	public void setEdgeTransID(BigInteger ExRecRouteInstructionIntID) {
		this.ExRecRouteInstructionIntID = ExRecRouteInstructionIntID;
	}
	public List<BigInteger> getExRecRouteInstructionIntIDList() {
		return ExRecRouteInstructionIntIDList;
	}
	public void setExRecRouteInstructionIntIDList(List<BigInteger> ExRecRouteInstructionIntIDList) {
		this.ExRecRouteInstructionIntIDList = ExRecRouteInstructionIntIDList;
	}
}