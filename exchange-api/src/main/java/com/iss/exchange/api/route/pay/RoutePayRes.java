package com.iss.exchange.api.route.pay;

import com.iss.exchange.api.HeadRes;

public class RoutePayRes {

	private HeadRes headRes;
	private Innser innser;
	public class Innser{
		private String OrderId;//		Y	序号，和请求
		private String OrderNo;//		N	业务序列号
		private String OrderBankNo;//		N	发往银行记账流水
		private String InstrDate;//		N	指令日期
		private String InstrTime;//		N	指令时间
		private String BankStatus;//		Y	指令状态
		private String ResReserved1;//			备用1
		private String ResReserved2	;//		备用2
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
		public String getOrderBankNo() {
			return OrderBankNo;
		}
		public void setOrderBankNo(String orderBankNo) {
			OrderBankNo = orderBankNo;
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
		
	}
	public HeadRes getHeadRes() {
		return headRes;
	}
	public void setHeadRes(HeadRes headRes) {
		this.headRes = headRes;
	}
	public Innser getInnser() {
		return innser;
	}
	public void setInnser(Innser innser) {
		this.innser = innser;
	}
	

}
