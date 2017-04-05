package com.iss.exchange.core.base.dto;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.iss.exchange.core.common.ExchangeReturnCode;
import com.iss.finanframe.mvc.dto.AbstractResponse;
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)
public class BaseResponse extends AbstractResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1324980115489876521L;
	public  static  final  String projectName="UPP-";

    public ExchangeReturnCode getReturnCode() {
        if (returnCode == null) {
            try {
                String index =  super.getRespHeader().getRespCode().replace( projectName,"");

                this.returnCode = ExchangeReturnCode.GetValue(Integer.valueOf(index)) ;// Enum.valueOf(AMSReturnCode.class, super.getRespHeader().getRespCode());
            } catch (Exception ex) {
                logger.info("默认的成功请使用 AbstractResponse SUCCESS ");
            }
        }
        return returnCode;
    }

    public void setReturnCode(ExchangeReturnCode uppReturnCode) {
        super.setRespHeader(uppReturnCode);
        this.returnCode = uppReturnCode;
    }

    @JsonIgnore
    @JSONField(serialize = false,deserialize = false)
    private ExchangeReturnCode returnCode = null;

    public  BaseResponse(BaseRequest request) {
        super(request,ExchangeReturnCode.SUCCESS);
    }
    
    public  BaseResponse(BaseRequest request,ExchangeReturnCode uppReturnCode) {
        super(request,uppReturnCode);
    }    
    public  BaseResponse(BaseRequest request,ExchangeReturnCode uppReturnCode,String resMessageExt) {
        super(request,uppReturnCode,resMessageExt);
    }  
}
