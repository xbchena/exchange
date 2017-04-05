package com.iss.finanframe.mvc.dto;
//

import javax.validation.Valid;
import java.io.Serializable;


public abstract class AbstractRequest implements Serializable {

	private static final long serialVersionUID = 2495768164848811730L;

	@Valid
	private ReqHeader reqHeader ;

	public ReqHeader getReqHeader() {

		if(reqHeader==null)
			reqHeader =  new ReqHeader();
		return reqHeader;
	}

	public void setReqHeader(ReqHeader reqHeader) {
		this.reqHeader = reqHeader;
	}

	@Override
	public String toString() {
		return "[reqHeader=" + reqHeader.toString() + "]";
	}

	
	
}
