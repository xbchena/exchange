package com.iss.exchange.api.route.rec;

import com.iss.exchange.api.HeadRes;

public class RouteQueryRecRes {
	private HeadRes headRes;
	private String QueryTxPackNo;//		Y	请求报头序列号TxPackNo 
	private Innser innser;//
	public class Innser{
		private String OrderId;//		Y	
		private String OrderNo;//		N	业务序列号
		private String InstrDate;//		N	指令日期
		private String InstrTime;//		N	指令时间
		private String BankStatus;//		Y	指令状态
		private String iRetCode;//		Y	执行结果返回码
		private String iRetMessage;//		Y	执行结果返回描述
		private String BankSequence	;//		通道发往银行的请求流水
		private String RecAccNo	;//	Y	收款账号
		private String RecBranchType;//		Y	收方银行类型
		private String ResReserved1;//			备用1
		private String ResReserved2;//			备用2
		public String getOrderId() {
			return OrderId;
		}
		public void setOrderId(String orderId) {
			OrderId = orderId;
		}
		public String getOrderNo() {
			return OrderNo;
		}
		public void setOrderNo(String orderNo) {
			OrderNo = orderNo;
		}
		public String getInstrDate() {
			return InstrDate;
		}
		public void setInstrDate(String instrDate) {
			InstrDate = instrDate;
		}
		public String getInstrTime() {
			return InstrTime;
		}
		public void setInstrTime(String instrTime) {
			InstrTime = instrTime;
		}
		public String getBankStatus() {
			return BankStatus;
		}
		public void setBankStatus(String bankStatus) {
			BankStatus = bankStatus;
		}
		public String getiRetCode() {
			return iRetCode;
		}
		public void setiRetCode(String iRetCode) {
			this.iRetCode = iRetCode;
		}
		public String getiRetMessage() {
			return iRetMessage;
		}
		public void setiRetMessage(String iRetMessage) {
			this.iRetMessage = iRetMessage;
		}
		public String getResReserved1() {
			return ResReserved1;
		}
		public void setResReserved1(String resReserved1) {
			ResReserved1 = resReserved1;
		}
		public String getResReserved2() {
			return ResReserved2;
		}
		public void setResReserved2(String resReserved2) {
			ResReserved2 = resReserved2;
		}
		public String getBankSequence() {
			return BankSequence;
		}
		public void setBankSequence(String bankSequence) {
			BankSequence = bankSequence;
		}
		public String getRecAccNo() {
			return RecAccNo;
		}
		public void setRecAccNo(String recAccNo) {
			RecAccNo = recAccNo;
		}
		public String getRecBranchType() {
			return RecBranchType;
		}
		public void setRecBranchType(String recBranchType) {
			RecBranchType = recBranchType;
		}

	}
	public HeadRes getHeadRes() {
		return headRes;
	}
	public void setHeadRes(HeadRes headRes) {
		this.headRes = headRes;
	}
	public String getQueryTxPackNo() {
		return QueryTxPackNo;
	}
	public void setQueryTxPackNo(String queryTxPackNo) {
		QueryTxPackNo = queryTxPackNo;
	}
	public Innser getInnser() {
		return innser;
	}
	public void setInnser(Innser innser) {
		this.innser = innser;
	}
	

}
