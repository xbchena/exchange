package com.iss.exchange.core.transaction.dto.request;

import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;
import io.swagger.annotations.ApiModelProperty;
import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.transaction.entity.ExReconciliationResult;
public class ExReconciliationResultRequest extends BaseRequest{

	private static final long serialVersionUID = 1L;

	private ExReconciliationResult ExReconciliationResult = new ExReconciliationResult();

	private BigInteger ExReconciliationResultID;

	private List<BigInteger> ExReconciliationResultIDList;

	private List<? extends ExReconciliationResult> ExReconciliationResultList = new ArrayList<ExReconciliationResult>();

	public List<? extends ExReconciliationResult> getExReconciliationResultList() {
		return ExReconciliationResultList;
	}
	public void setExReconciliationResultList(List<? extends ExReconciliationResult> ExReconciliationResultList) {
		this.ExReconciliationResultList = ExReconciliationResultList;
	}
	public ExReconciliationResult getExReconciliationResult() {
		return ExReconciliationResult;
	}
	public void setExReconciliationResult(ExReconciliationResult ExReconciliationResult) {
		this.ExReconciliationResult = ExReconciliationResult;
	}
	public BigInteger getExReconciliationResultID() {
		return ExReconciliationResultID;
	}
	public void setEdgeTransID(BigInteger ExReconciliationResultID) {
		this.ExReconciliationResultID = ExReconciliationResultID;
	}
	public List<BigInteger> getExReconciliationResultIDList() {
		return ExReconciliationResultIDList;
	}
	public void setExReconciliationResultIDList(List<BigInteger> ExReconciliationResultIDList) {
		this.ExReconciliationResultIDList = ExReconciliationResultIDList;
	}
}