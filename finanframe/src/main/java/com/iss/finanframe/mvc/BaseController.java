package com.iss.finanframe.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.iss.finanframe.exception.ExceptionEnums;
import com.iss.finanframe.mvc.dto.AbstractRequest;
import com.iss.finanframe.mvc.dto.AbstractResponse;

public class BaseController {

	protected Logger logger = LoggerFactory.getLogger(getClass().getName());

	// 和接口组保持一致，在resMessageExt显示全部信息。
	protected void setResponse(AbstractRequest request, AbstractResponse response, ExceptionEnums exceptionEnums,
			String message) {
		response.getRespHeader()
				.setResMessageExt(exceptionEnums.getCode() + "-" + exceptionEnums.getName() + message); // 返回具体异常信息
		setResponse(request, response, exceptionEnums);
	}

	// protected void setResponse(AbstractRequest request,AbstractResponse
	// response,ExceptionEnums exceptionEnums,String message){
	// response.getRespHeader().setResMessageExt(message); //返回具体异常信息
	// setResponse(request,response,exceptionEnums);
	// }
	protected void setResponse(AbstractRequest request, AbstractResponse response, ExceptionEnums exceptionEnums) {
		response.setRespHeader(exceptionEnums);
		setResponse(request, response);
	}

	protected void setResponse(AbstractRequest request, AbstractResponse response) {
		if(request != null && request.getReqHeader() != null){
			response.getRespHeader().setSessionId(request.getReqHeader().getSessionId());
			response.getRespHeader().setReqId(request.getReqHeader().getReqId());
			response.getRespHeader().setBusinessSeqNo((request.getReqHeader().getBusinessSeqNo()));
			response.getRespHeader().setServiceName((request.getReqHeader().getServiceName()));
		}
	}

	/**
	 * 获取请求Request
	 * 
	 * @return
	 */
	protected HttpServletRequest getRequest() {
		ServletRequestAttributes attrs = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		return attrs.getRequest();
	}

	/**
	 * 获取请求Request
	 * 
	 * @return
	 */
	protected HttpServletResponse getRespons() {
		ServletRequestAttributes attrs = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		return attrs.getResponse();
	}

	/**
	 * 获取UserPrincipal
	 * 
	 * @return
	 */
	protected Object getUserPrincipal() {
		return getRequest().getAttribute("SESSION_USER_PRINCIPAL");
	}

	/**
	 * 获取ApplicationContext
	 * 
	 * @return
	 */
	protected ApplicationContext getApplicationContext() {
		ApplicationContext applicationContext = (ApplicationContext) WebApplicationContextUtils
				.getWebApplicationContext(getRequest().getServletContext());
		return applicationContext;
	}
}
