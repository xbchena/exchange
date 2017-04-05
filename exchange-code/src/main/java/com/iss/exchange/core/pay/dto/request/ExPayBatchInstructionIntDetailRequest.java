package com.iss.exchange.core.pay.dto.request;

import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;
import io.swagger.annotations.ApiModelProperty;
import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.pay.entity.ExPayBatchInstructionIntDetail;
public class ExPayBatchInstructionIntDetailRequest extends BaseRequest{

	private static final long serialVersionUID = 1L;

	private ExPayBatchInstructionIntDetail ExPayBatchInstructionIntDetail = new ExPayBatchInstructionIntDetail();

	private BigInteger ExPayBatchInstructionIntDetailID;

	private List<BigInteger> ExPayBatchInstructionIntDetailIDList;

	private List<? extends ExPayBatchInstructionIntDetail> ExPayBatchInstructionIntDetailList = new ArrayList<ExPayBatchInstructionIntDetail>();

	public List<? extends ExPayBatchInstructionIntDetail> getExPayBatchInstructionIntDetailList() {
		return ExPayBatchInstructionIntDetailList;
	}
	public void setExPayBatchInstructionIntDetailList(List<? extends ExPayBatchInstructionIntDetail> ExPayBatchInstructionIntDetailList) {
		this.ExPayBatchInstructionIntDetailList = ExPayBatchInstructionIntDetailList;
	}
	public ExPayBatchInstructionIntDetail getExPayBatchInstructionIntDetail() {
		return ExPayBatchInstructionIntDetail;
	}
	public void setExPayBatchInstructionIntDetail(ExPayBatchInstructionIntDetail ExPayBatchInstructionIntDetail) {
		this.ExPayBatchInstructionIntDetail = ExPayBatchInstructionIntDetail;
	}
	public BigInteger getExPayBatchInstructionIntDetailID() {
		return ExPayBatchInstructionIntDetailID;
	}
	public void setEdgeTransID(BigInteger ExPayBatchInstructionIntDetailID) {
		this.ExPayBatchInstructionIntDetailID = ExPayBatchInstructionIntDetailID;
	}
	public List<BigInteger> getExPayBatchInstructionIntDetailIDList() {
		return ExPayBatchInstructionIntDetailIDList;
	}
	public void setExPayBatchInstructionIntDetailIDList(List<BigInteger> ExPayBatchInstructionIntDetailIDList) {
		this.ExPayBatchInstructionIntDetailIDList = ExPayBatchInstructionIntDetailIDList;
	}
}