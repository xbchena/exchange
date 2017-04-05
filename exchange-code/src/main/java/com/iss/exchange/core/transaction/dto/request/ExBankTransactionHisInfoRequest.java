package com.iss.exchange.core.transaction.dto.request;

import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;
import io.swagger.annotations.ApiModelProperty;
import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.transaction.entity.ExBankTransactionHisInfo;
public class ExBankTransactionHisInfoRequest extends BaseRequest{

	private static final long serialVersionUID = 1L;

	private ExBankTransactionHisInfo ExBankTransactionHisInfo = new ExBankTransactionHisInfo();

	private BigInteger ExBankTransactionHisInfoID;

	private List<BigInteger> ExBankTransactionHisInfoIDList;

	private List<? extends ExBankTransactionHisInfo> ExBankTransactionHisInfoList = new ArrayList<ExBankTransactionHisInfo>();

	public List<? extends ExBankTransactionHisInfo> getExBankTransactionHisInfoList() {
		return ExBankTransactionHisInfoList;
	}
	public void setExBankTransactionHisInfoList(List<? extends ExBankTransactionHisInfo> ExBankTransactionHisInfoList) {
		this.ExBankTransactionHisInfoList = ExBankTransactionHisInfoList;
	}
	public ExBankTransactionHisInfo getExBankTransactionHisInfo() {
		return ExBankTransactionHisInfo;
	}
	public void setExBankTransactionHisInfo(ExBankTransactionHisInfo ExBankTransactionHisInfo) {
		this.ExBankTransactionHisInfo = ExBankTransactionHisInfo;
	}
	public BigInteger getExBankTransactionHisInfoID() {
		return ExBankTransactionHisInfoID;
	}
	public void setEdgeTransID(BigInteger ExBankTransactionHisInfoID) {
		this.ExBankTransactionHisInfoID = ExBankTransactionHisInfoID;
	}
	public List<BigInteger> getExBankTransactionHisInfoIDList() {
		return ExBankTransactionHisInfoIDList;
	}
	public void setExBankTransactionHisInfoIDList(List<BigInteger> ExBankTransactionHisInfoIDList) {
		this.ExBankTransactionHisInfoIDList = ExBankTransactionHisInfoIDList;
	}
}