package com.iss.exchange.core.pay.dto.request;

import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;
import io.swagger.annotations.ApiModelProperty;
import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.pay.entity.ExRecBatchInstructionIntDetail;
public class ExRecBatchInstructionIntDetailRequest extends BaseRequest{

	private static final long serialVersionUID = 1L;

	private ExRecBatchInstructionIntDetail ExRecBatchInstructionIntDetail = new ExRecBatchInstructionIntDetail();

	private BigInteger ExRecBatchInstructionIntDetailID;

	private List<BigInteger> ExRecBatchInstructionIntDetailIDList;

	private List<? extends ExRecBatchInstructionIntDetail> ExRecBatchInstructionIntDetailList = new ArrayList<ExRecBatchInstructionIntDetail>();

	public List<? extends ExRecBatchInstructionIntDetail> getExRecBatchInstructionIntDetailList() {
		return ExRecBatchInstructionIntDetailList;
	}
	public void setExRecBatchInstructionIntDetailList(List<? extends ExRecBatchInstructionIntDetail> ExRecBatchInstructionIntDetailList) {
		this.ExRecBatchInstructionIntDetailList = ExRecBatchInstructionIntDetailList;
	}
	public ExRecBatchInstructionIntDetail getExRecBatchInstructionIntDetail() {
		return ExRecBatchInstructionIntDetail;
	}
	public void setExRecBatchInstructionIntDetail(ExRecBatchInstructionIntDetail ExRecBatchInstructionIntDetail) {
		this.ExRecBatchInstructionIntDetail = ExRecBatchInstructionIntDetail;
	}
	public BigInteger getExRecBatchInstructionIntDetailID() {
		return ExRecBatchInstructionIntDetailID;
	}
	public void setEdgeTransID(BigInteger ExRecBatchInstructionIntDetailID) {
		this.ExRecBatchInstructionIntDetailID = ExRecBatchInstructionIntDetailID;
	}
	public List<BigInteger> getExRecBatchInstructionIntDetailIDList() {
		return ExRecBatchInstructionIntDetailIDList;
	}
	public void setExRecBatchInstructionIntDetailIDList(List<BigInteger> ExRecBatchInstructionIntDetailIDList) {
		this.ExRecBatchInstructionIntDetailIDList = ExRecBatchInstructionIntDetailIDList;
	}
}