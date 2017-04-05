package com.iss.exchange.api.route.pay;

import com.iss.exchange.api.HeadRes;

public class RouteQueryPayReq {

	private HeadRes headRes;
	private String QueryTxPackNo;//		Y	请求报头序列号TxPackNo 
	private String OrderId;//		N	序号
	private String OrderNo;//		N	业务序列号
	private String ReqReserved1;//			备用1
	private String ReqReserved2	;//		备用2
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
