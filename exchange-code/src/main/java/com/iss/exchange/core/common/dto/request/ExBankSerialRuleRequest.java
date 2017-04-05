package com.iss.exchange.core.common.dto.request;

import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;
import io.swagger.annotations.ApiModelProperty;
import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.common.entity.ExBankSerialRule;
public class ExBankSerialRuleRequest extends BaseRequest{

	private static final long serialVersionUID = 1L;

	private ExBankSerialRule ExBankSerialRule = new ExBankSerialRule();

	private BigInteger ExBankSerialRuleID;

	private List<BigInteger> ExBankSerialRuleIDList;

	private List<? extends ExBankSerialRule> ExBankSerialRuleList = new ArrayList<ExBankSerialRule>();

	public List<? extends ExBankSerialRule> getExBankSerialRuleList() {
		return ExBankSerialRuleList;
	}
	public void setExBankSerialRuleList(List<? extends ExBankSerialRule> ExBankSerialRuleList) {
		this.ExBankSerialRuleList = ExBankSerialRuleList;
	}
	public ExBankSerialRule getExBankSerialRule() {
		return ExBankSerialRule;
	}
	public void setExBankSerialRule(ExBankSerialRule ExBankSerialRule) {
		this.ExBankSerialRule = ExBankSerialRule;
	}
	public BigInteger getExBankSerialRuleID() {
		return ExBankSerialRuleID;
	}
	public void setEdgeTransID(BigInteger ExBankSerialRuleID) {
		this.ExBankSerialRuleID = ExBankSerialRuleID;
	}
	public List<BigInteger> getExBankSerialRuleIDList() {
		return ExBankSerialRuleIDList;
	}
	public void setExBankSerialRuleIDList(List<BigInteger> ExBankSerialRuleIDList) {
		this.ExBankSerialRuleIDList = ExBankSerialRuleIDList;
	}
}