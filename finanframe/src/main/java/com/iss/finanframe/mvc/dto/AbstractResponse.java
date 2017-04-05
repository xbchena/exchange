package com.iss.finanframe.mvc.dto;

import java.io.Serializable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.iss.finanframe.exception.ExceptionEnums;

public abstract class AbstractResponse implements Serializable {

	public static Logger logger = LogManager.getLogger(AbstractResponse.class);

	private static final long serialVersionUID = -6707591121306386148L;
	
	private RespHeader respHeader;

	public AbstractResponse(AbstractRequest res, ExceptionEnums exceptionEnums) {
		initAbstractResponse(res, exceptionEnums.getCode(), exceptionEnums.getName(), null);
	}

	public AbstractResponse(AbstractRequest res, ExceptionEnums exceptionEnums, String resMessageExt) {
		initAbstractResponse(res, exceptionEnums.getCode(), exceptionEnums.getName(), resMessageExt);
	}

	public AbstractResponse(AbstractRequest res, String code, String name) {
		initAbstractResponse(res, code, name, null);
	}

	public AbstractResponse(AbstractRequest res, String code, String name, String resMessageExt) {
		initAbstractResponse(res, code, name, resMessageExt);
	}
	
	public AbstractResponse(String serviceName,String reqId,String businessSeqNo,String sessionId) {
		RespHeader respHeader = new RespHeader();
		respHeader.setServiceName(serviceName);
		respHeader.setReqId(reqId);
		respHeader.setBusinessSeqNo(businessSeqNo);
		respHeader.setSessionId(sessionId);
		this.setRespHeader(respHeader);
	}

	private void initAbstractResponse(AbstractRequest res, String code, String name, String resMessageExt) {
		if (null != res) {
			ReqHeader reqHeader = res.getReqHeader();
			RespHeader respHeader = new RespHeader(code, name, resMessageExt);
			respHeader.setReqId(reqHeader.getReqId());
			respHeader.setBusinessSeqNo(reqHeader.getBusinessSeqNo());
			respHeader.setSessionId(reqHeader.getSessionId());
			respHeader.setServiceName(reqHeader.getServiceName());
			this.setRespHeader(respHeader);
		} else {
			logger.info("尽量初始化AbstractRequest");
			this.respHeader = new RespHeader(code, name, resMessageExt);
		}
	}

	public RespHeader getRespHeader() {
		return respHeader;
	}

	public void setRespHeader(RespHeader respHeader) {
		this.respHeader = respHeader;
	}

	public void setRespHeader(RespHeader respHeader, ExceptionEnums exceptionEnums) {
		this.respHeader = respHeader;
		setRespHeader(exceptionEnums);

	}

	public void setRespHeader(ExceptionEnums exceptionEnums) {
		if (exceptionEnums != null) {
			RespHeader header = getRespHeader();
			header.setRespCode(exceptionEnums.getCode());
			header.setRespMessage(exceptionEnums.getName());
			setRespHeader(header);
		}

	}

	public void setRespHeader(ExceptionEnums exceptionEnums, String originalRespCode, String originalRespMessage) {
		RespHeader header = getRespHeader();
		if (exceptionEnums != null) {
			header.setRespCode(exceptionEnums.getCode());
			header.setRespMessage(exceptionEnums.getName());
			header.setOriginalRespCode(originalRespCode);
			header.setOriginalRespMessage(originalRespMessage);
		}
		setRespHeader(header);
	}
	
}
