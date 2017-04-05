package com.iss.exchange.core.base.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.iss.finanframe.mvc.dto.AbstractRequest;
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)
public class BaseRequest extends AbstractRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2000943111566018284L;

}
