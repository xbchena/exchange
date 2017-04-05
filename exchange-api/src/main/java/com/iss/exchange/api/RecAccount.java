package com.iss.exchange.api;

public class RecAccount {
	private String RecAccNo	;//	Y	收方账号
	private String 	RecAccName;//		Y	收方户名
	private String RecBranchName;//		Y	收方开户银行
	private String RecBranchType;//		N	收方银行类型
	private String RecBankCNAPS;//		N	收方人行号
	private String RecProvinceName;//		Y	收方省份
	private String RecCityName;//		Y	收方城市
	private String RecBranchUniteCode;//		N	收方联行号
	private String RecCardFlag;//		N	收方卡折标示
	private String RecContPhone;//		N	收方联系电话
	public String getRecAccNo() {
		return RecAccNo;
	}
	public void setRecAccNo(String recAccNo) {
		RecAccNo = recAccNo;
	}
	public String getRecAccName() {
		return RecAccName;
	}
	public void setRecAccName(String recAccName) {
		RecAccName = recAccName;
	}
	public String getRecBranchName() {
		return RecBranchName;
	}
	public void setRecBranchName(String recBranchName) {
		RecBranchName = recBranchName;
	}
	public String getRecBranchType() {
		return RecBranchType;
	}
	public void setRecBranchType(String recBranchType) {
		RecBranchType = recBranchType;
	}
	public String getRecBankCNAPS() {
		return RecBankCNAPS;
	}
	public void setRecBankCNAPS(String recBankCNAPS) {
		RecBankCNAPS = recBankCNAPS;
	}
	public String getRecProvinceName() {
		return RecProvinceName;
	}
	public void setRecProvinceName(String recProvinceName) {
		RecProvinceName = recProvinceName;
	}
	public String getRecCityName() {
		return RecCityName;
	}
	public void setRecCityName(String recCityName) {
		RecCityName = recCityName;
	}
	public String getRecBranchUniteCode() {
		return RecBranchUniteCode;
	}
	public void setRecBranchUniteCode(String recBranchUniteCode) {
		RecBranchUniteCode = recBranchUniteCode;
	}
	public String getRecCardFlag() {
		return RecCardFlag;
	}
	public void setRecCardFlag(String recCardFlag) {
		RecCardFlag = recCardFlag;
	}
	public String getRecContPhone() {
		return RecContPhone;
	}
	public void setRecContPhone(String recContPhone) {
		RecContPhone = recContPhone;
	}

}
