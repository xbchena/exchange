package com.iss.exchange.core.pay.dto.request;

import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;
import io.swagger.annotations.ApiModelProperty;
import com.iss.exchange.core.base.dto.BaseRequest;
import com.iss.exchange.core.pay.entity.ExRecBatchInstructionOutDetail;
public class ExRecBatchInstructionOutDetailRequest extends BaseRequest{

	private static final long serialVersionUID = 1L;

	private ExRecBatchInstructionOutDetail ExRecBatchInstructionOutDetail = new ExRecBatchInstructionOutDetail();

	private BigInteger ExRecBatchInstructionOutDetailID;

	private List<BigInteger> ExRecBatchInstructionOutDetailIDList;

	private List<? extends ExRecBatchInstructionOutDetail> ExRecBatchInstructionOutDetailList = new ArrayList<ExRecBatchInstructionOutDetail>();

	public List<? extends ExRecBatchInstructionOutDetail> getExRecBatchInstructionOutDetailList() {
		return ExRecBatchInstructionOutDetailList;
	}
	public void setExRecBatchInstructionOutDetailList(List<? extends ExRecBatchInstructionOutDetail> ExRecBatchInstructionOutDetailList) {
		this.ExRecBatchInstructionOutDetailList = ExRecBatchInstructionOutDetailList;
	}
	public ExRecBatchInstructionOutDetail getExRecBatchInstructionOutDetail() {
		return ExRecBatchInstructionOutDetail;
	}
	public void setExRecBatchInstructionOutDetail(ExRecBatchInstructionOutDetail ExRecBatchInstructionOutDetail) {
		this.ExRecBatchInstructionOutDetail = ExRecBatchInstructionOutDetail;
	}
	public BigInteger getExRecBatchInstructionOutDetailID() {
		return ExRecBatchInstructionOutDetailID;
	}
	public void setEdgeTransID(BigInteger ExRecBatchInstructionOutDetailID) {
		this.ExRecBatchInstructionOutDetailID = ExRecBatchInstructionOutDetailID;
	}
	public List<BigInteger> getExRecBatchInstructionOutDetailIDList() {
		return ExRecBatchInstructionOutDetailIDList;
	}
	public void setExRecBatchInstructionOutDetailIDList(List<BigInteger> ExRecBatchInstructionOutDetailIDList) {
		this.ExRecBatchInstructionOutDetailIDList = ExRecBatchInstructionOutDetailIDList;
	}
}