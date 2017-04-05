package com.iss.exchange.api;

public class PayAccount {
	private String PayAccNo;//		Y	付款账号
	private String PayAccName;//		N	付款名称
	private String PayBranchType;//		Y	付方银行类型
	private String PayBranchName;//		N	付款银行名称
	private String PayProvinceName;//		N	付方省份
	private String PayCityName;//		N	付方城市
	private String PayBankCNAPS;// 付方人行号
	private String PayBranchUniteCode;//		N	付方联行号
	private String PayCardFlag;//		N	付方卡折标示
	private String PayContPhone;//	N	付方联系电话
	public String getPayAccNo() {
		return PayAccNo;
	}
	public void setPayAccNo(String payAccNo) {
		PayAccNo = payAccNo;
	}
	public String getPayAccName() {
		return PayAccName;
	}
	public void setPayAccName(String payAccName) {
		PayAccName = payAccName;
	}
	public String getPayBranchType() {
		return PayBranchType;
	}
	public void setPayBranchType(String payBranchType) {
		PayBranchType = payBranchType;
	}
	public String getPayBranchName() {
		return PayBranchName;
	}
	public void setPayBranchName(String payBranchName) {
		PayBranchName = payBranchName;
	}
	public String getPayProvinceName() {
		return PayProvinceName;
	}
	public void setPayProvinceName(String payProvinceName) {
		PayProvinceName = payProvinceName;
	}
	public String getPayCityName() {
		return PayCityName;
	}
	public void setPayCityName(String payCityName) {
		PayCityName = payCityName;
	}
	public String getPayBankCNAPS() {
		return PayBankCNAPS;
	}
	public void setPayBankCNAPS(String payBankCNAPS) {
		PayBankCNAPS = payBankCNAPS;
	}
	public String getPayBranchUniteCode() {
		return PayBranchUniteCode;
	}
	public void setPayBranchUniteCode(String payBranchUniteCode) {
		PayBranchUniteCode = payBranchUniteCode;
	}
	public String getPayCardFlag() {
		return PayCardFlag;
	}
	public void setPayCardFlag(String payCardFlag) {
		PayCardFlag = payCardFlag;
	}
	public String getPayContPhone() {
		return PayContPhone;
	}
	public void setPayContPhone(String payContPhone) {
		PayContPhone = payContPhone;
	}
	
}
