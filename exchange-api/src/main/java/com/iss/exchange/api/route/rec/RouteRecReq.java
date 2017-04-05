package com.iss.exchange.api.route.rec;

import java.util.List;

import com.iss.exchange.api.HeadReq;
import com.iss.exchange.api.PayAccount;

public class RouteRecReq {

	private HeadReq headReq;
	private List<Innser> innser;
	public class Innser{
		private PayAccount payAccount;//对方信息
		private String OrderId	;//	Y	序号
		private String OrderNo	;//	N	业务序列号
		private String OrderBankNo	;//	N	发往银行记账流水
		private String Rectype;//		Y	处理速度
		private String RecAmt;//		Y	交易金额
		private String CurrType;//		Y	交易币种
		private String SysIOFlg	;//	Y	是否同行
		private String IsSameCity ;//N	是否同城
		private String Prop		;//Y	
		private String RecBusType;//			对私业务类型
		private String Summary	;//		摘要
		private String PostScript;//			附言
		private String ReqReserved1;//			备用1
		private String ReqReserved2	;//		备用2
		public PayAccount getPayAccount() {
			return payAccount;
		}
		public void setPayAccount(PayAccount payAccount) {
			this.payAccount = payAccount;
		}
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
		public String getRectype() {
			return Rectype;
		}
		public void setRectype(String rectype) {
			Rectype = rectype;
		}
		public String getRecAmt() {
			return RecAmt;
		}
		public void setRecAmt(String recAmt) {
			RecAmt = recAmt;
		}
		public String getCurrType() {
			return CurrType;
		}
		public void setCurrType(String currType) {
			CurrType = currType;
		}
		public String getSysIOFlg() {
			return SysIOFlg;
		}
		public void setSysIOFlg(String sysIOFlg) {
			SysIOFlg = sysIOFlg;
		}
		public String getIsSameCity() {
			return IsSameCity;
		}
		public void setIsSameCity(String isSameCity) {
			IsSameCity = isSameCity;
		}
		public String getProp() {
			return Prop;
		}
		public void setProp(String prop) {
			Prop = prop;
		}
		public String getRecBusType() {
			return RecBusType;
		}
		public void setRecBusType(String recBusType) {
			RecBusType = recBusType;
		}
		public String getSummary() {
			return Summary;
		}
		public void setSummary(String summary) {
			Summary = summary;
		}
		public String getPostScript() {
			return PostScript;
		}
		public void setPostScript(String postScript) {
			PostScript = postScript;
		}
		public String getReqReserved1() {
			return ReqReserved1;
		}
		public void setReqReserved1(String reqReserved1) {
			ReqReserved1 = reqReserved1;
		}
		public String getReqReserved2() {
			return ReqReserved2;
		}
		public void setReqReserved2(String reqReserved2) {
			ReqReserved2 = reqReserved2;
		}
	}
	public HeadReq getHeadReq() {
		return headReq;
	}
	public void setHeadReq(HeadReq headReq) {
		this.headReq = headReq;
	}
	public List<Innser> getInnser() {
		return innser;
	}
	public void setInnser(List<Innser> innser) {
		this.innser = innser;
	}
	

}
