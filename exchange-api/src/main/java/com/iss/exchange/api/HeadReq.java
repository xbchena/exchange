package com.iss.exchange.api;

import com.alibaba.fastjson.JSON;

public class HeadReq {
	private String version;// 	版本
	private String OrgId;//	组织机构代码
	private String Orgname;//	组织机构名称
	private String LoginId;//	接入用户
	private String LoginPwd;//	用户密码
	private String TxDate;//	交易日期
	private String TxTime;//	交易时间
	private String TxPackNo;//	请求序列号
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getOrgId() {
		return OrgId;
	}
	public void setOrgId(String orgId) {
		OrgId = orgId;
	}
	public String getOrgname() {
		return Orgname;
	}
	public void setOrgname(String orgname) {
		Orgname = orgname;
	}
	public String getLoginId() {
		return LoginId;
	}
	public void setLoginId(String loginId) {
		LoginId = loginId;
	}
	public String getLoginPwd() {
		return LoginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		LoginPwd = loginPwd;
	}
	public String getTxDate() {
		return TxDate;
	}
	public void setTxDate(String txDate) {
		TxDate = txDate;
	}
	public String getTxTime() {
		return TxTime;
	}
	public void setTxTime(String txTime) {
		TxTime = txTime;
	}
	public String getTxPackNo() {
		return TxPackNo;
	}
	public void setTxPackNo(String txPackNo) {
		TxPackNo = txPackNo;
	}

	public static void main(String[] args) {
		HeadReq req = new HeadReq();
		req.setLoginId("id");
		req.setLoginPwd("pwd");
//		System.out.println(JSON.toJSONString(req));
		String reqs = JSON.toJSONString(req);
		HeadReq res = JSON.parseObject(reqs, HeadReq.class);
		System.out.println(res.getLoginId());
		
	}
}
