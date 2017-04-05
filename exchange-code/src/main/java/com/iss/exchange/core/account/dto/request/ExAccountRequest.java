package com.iss.exchange.core.account.dto.request;

import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;
import io.swagger.annotations.ApiModelProperty;
import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.account.entity.ExAccount;
public class ExAccountRequest extends BaseRequest{

	private static final long serialVersionUID = 1L;

	private ExAccount ExAccount = new ExAccount();

	private BigInteger ExAccountID;

	private List<BigInteger> ExAccountIDList;

	private List<? extends ExAccount> ExAccountList = new ArrayList<ExAccount>();

	public List<? extends ExAccount> getExAccountList() {
		return ExAccountList;
	}
	public void setExAccountList(List<? extends ExAccount> ExAccountList) {
		this.ExAccountList = ExAccountList;
	}
	public ExAccount getExAccount() {
		return ExAccount;
	}
	public void setExAccount(ExAccount ExAccount) {
		this.ExAccount = ExAccount;
	}
	public BigInteger getExAccountID() {
		return ExAccountID;
	}
	public void setEdgeTransID(BigInteger ExAccountID) {
		this.ExAccountID = ExAccountID;
	}
	public List<BigInteger> getExAccountIDList() {
		return ExAccountIDList;
	}
	public void setExAccountIDList(List<BigInteger> ExAccountIDList) {
		this.ExAccountIDList = ExAccountIDList;
	}
}