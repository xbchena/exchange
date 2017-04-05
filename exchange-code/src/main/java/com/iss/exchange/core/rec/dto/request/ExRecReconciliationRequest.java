package com.iss.exchange.core.rec.dto.request;

import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;
import io.swagger.annotations.ApiModelProperty;
import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.rec.entity.ExRecReconciliation;
public class ExRecReconciliationRequest extends BaseRequest{

	private static final long serialVersionUID = 1L;

	private ExRecReconciliation ExRecReconciliation = new ExRecReconciliation();

	private BigInteger ExRecReconciliationID;

	private List<BigInteger> ExRecReconciliationIDList;

	private List<? extends ExRecReconciliation> ExRecReconciliationList = new ArrayList<ExRecReconciliation>();

	public List<? extends ExRecReconciliation> getExRecReconciliationList() {
		return ExRecReconciliationList;
	}
	public void setExRecReconciliationList(List<? extends ExRecReconciliation> ExRecReconciliationList) {
		this.ExRecReconciliationList = ExRecReconciliationList;
	}
	public ExRecReconciliation getExRecReconciliation() {
		return ExRecReconciliation;
	}
	public void setExRecReconciliation(ExRecReconciliation ExRecReconciliation) {
		this.ExRecReconciliation = ExRecReconciliation;
	}
	public BigInteger getExRecReconciliationID() {
		return ExRecReconciliationID;
	}
	public void setEdgeTransID(BigInteger ExRecReconciliationID) {
		this.ExRecReconciliationID = ExRecReconciliationID;
	}
	public List<BigInteger> getExRecReconciliationIDList() {
		return ExRecReconciliationIDList;
	}
	public void setExRecReconciliationIDList(List<BigInteger> ExRecReconciliationIDList) {
		this.ExRecReconciliationIDList = ExRecReconciliationIDList;
	}
}