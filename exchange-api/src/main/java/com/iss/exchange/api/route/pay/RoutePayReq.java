package com.iss.exchange.api.route.pay;

import java.util.ArrayList;
import java.util.List;

import com.iss.exchange.api.HeadReq;
import com.iss.exchange.api.RecAccount;

public class RoutePayReq {

	private HeadReq headReq;
	private List<Innser> innser;
	
	public class Innser{
		private RecAccount recAccount;
		private String OrderId;//		Y	序号
		private String OrderNo;//		N	业务序列号
		private String OrderBankNo;//		N	发往银行记账流水
		private String PayType;//		Y	处理速度
		private String PayAmt;//		Y	交易金额
		private String CurrType;//		Y	交易币种
		private String SysIOFlg;//		Y	是否同行
		private String IsSameCity;// N	是否同城
		private String Prop;//		Y	
		private String PayBusType;//		条件必填	对私业务类型
		private String Summary	;//		摘要
		private String PostScript;//			附言
		private String ReqReserved1	;//		备用1
		private String ReqReserved2	;//		备用2
		public RecAccount getRecAccount() {
			return recAccount;
		}
		public void setRecAccount(RecAccount recAccount) {
			this.recAccount = recAccount;
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
		public String getPayType() {
			return PayType;
		}
		public void setPayType(String payType) {
			PayType = payType;
		}
		public String getPayAmt() {
			return PayAmt;
		}
		public void setPayAmt(String payAmt) {
			PayAmt = payAmt;
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
		public String getPayBusType() {
			return PayBusType;
		}
		public void setPayBusType(String payBusType) {
			PayBusType = payBusType;
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

	public void setInnser(ArrayList<Innser> innser) {
		this.innser = innser;
	}
	

}
