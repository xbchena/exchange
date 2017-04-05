package com.iss.finanframe.mvc.dto;

import java.io.Serializable;

/**
 * 通用的消息返回类
 */
public class RespHeader implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4240241150431232048L;

	public RespHeader() {

	}

	public RespHeader(String respCode, String respMessage) {
		this(respCode,respMessage,null);
	}
	public RespHeader(String respCode, String respMessage, String resMessageExt) {
		this(respCode,respMessage,resMessageExt,null,null);
	}
	public RespHeader(String respCode, String respMessage, String resMessageExt, String originalRespCode, String originalRespMessage) {
		this.respCode = respCode;
		this.respMessage = respMessage;
		this.resMessageExt = resMessageExt;
		this.originalRespCode = originalRespCode;
		this.originalRespMessage = originalRespMessage;
	}
	
	
	public RespHeader(String serviceName,String sessionId,String reqId,String businessSeqNo,
			String respCode, String respMessage, String resMessageExt, String originalRespCode, String originalRespMessage) {
		this.serviceName = serviceName;
		this.sessionId = sessionId;
		this.reqId = reqId;
		this.businessSeqNo = businessSeqNo;
		this.respCode = respCode;
		this.respMessage = respMessage;
		this.resMessageExt = resMessageExt;
		this.originalRespCode = originalRespCode;
		this.originalRespMessage = originalRespMessage;
	}	

	/**
	 * 返回代码
	 */
	private String respCode;

	/**
	 * 返回信息
	 */
	private String respMessage;

	/**
	 * 描述，自定义追加。 resMessage 的补充； 默认为空
	 */
	private String resMessageExt;

	/**
	 * 服务名称；ESB 路由的依据 ;--注释 伍鹏
	 */
	private String serviceName;

	/**
	 * 会话ID。一个场景会员sessionId中可以包含多个reqId
	 */
	private String sessionId;

	/**
	 * 请求的流水号，唯一。
	 * 
	 */
	private String reqId;

	/**
	 * 业务流水号， 一般交易接口使用
	 */
	private String businessSeqNo; // String N 16 业务流水号， 一般交易接口使用

	/**
	 * 通道（调用的外部系统接口）原始响应码
	 */
	private String originalRespCode; // String Y 通道原始响应码

	/**
	 * 通道（调用的外部系统接口）原始响应信息
	 */
	private String originalRespMessage; // String N 通道原始响应信息

	public String getOriginalRespCode() {
		return originalRespCode;
	}

	public void setOriginalRespCode(String originalRespCode) {
		this.originalRespCode = originalRespCode;
	}

	public String getOriginalRespMessage() {
		return originalRespMessage;
	}

	public void setOriginalRespMessage(String originalRespMessage) {
		this.originalRespMessage = originalRespMessage;
	}

	/**
	 * 服务名称；ESB 路由的依据 ;--注释 伍鹏
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * 服务名称；ESB 路由的依据 ;--注释 伍鹏
	 */
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	/**
	 * 描述，自定义追加。 resMessage 的补充； 默认为空
	 */
	public String getResMessageExt() {
		return resMessageExt;
	}

	/**
	 * 描述，自定义追加。 resMessage 的补充； 默认为空
	 */
	public void setResMessageExt(String resMessageExt) {
		this.resMessageExt = resMessageExt;
	}

	public String getRespCode() {
		return respCode;
	}

	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}

	public String getRespMessage() {
		return respMessage;
	}

	public void setRespMessage(String respMessage) {
		this.respMessage = respMessage;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getReqId() {
		return reqId;
	}

	public void setReqId(String reqId) {
		this.reqId = reqId;
	}

	public String getBusinessSeqNo() {
		return businessSeqNo;
	}

	public void setBusinessSeqNo(String businessSeqNo) {
		this.businessSeqNo = businessSeqNo;
	}

	public String toString() {
		return "[businessSeqNo:" + getBusinessSeqNo() + ",reqId:" + getReqId() + "serviceName:" + getServiceName()
				+ ",respCode:" + getRespCode() + ",respMessage:" + getRespMessage() + ",sessionId:" + getSessionId()
				+ ",reqId:" + getReqId() + ",resMessageExt:" + getResMessageExt() + "]";
	}

}
