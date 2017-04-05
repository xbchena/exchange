package com.iss.finanframe.mvc.dto;



import java.io.Serializable;


/**
 * 统一请求头
 * @author change
 *
 */
public class ReqHeader implements Serializable {

    private static final long serialVersionUID = -389585433927543882L;

    /**
     * 调用子公司ID,机构号
     */

    private String entityId;

    /**
     * 系统编号。新平台接入时，由统一账户平台分发
     */
    private String appId;

    /**
     * 会话ID。一个场景会员sessionId中可以包含多个reqId
     */
    private String sessionId;

    /**
     * 请求的流水号，报文流水号。
     */

    private String reqId;

    /**
     * 预留字段。以后供权限校验
     */
    private String accessToken;
    
    /**
     * 业务流水号， 一般交易接口使用
     */
    private String businessSeqNo;	//String	N	16	业务流水号， 一般交易接口使用
    /**
     * 报文日期
     */
    private String txDate;	//String 	Y	8	报文日期
    /**
     * 报文时间
     */
    private String txTime;	//String	Y	6	报文时间
    /**
     * 操作用户
     */
    private String userId;	//String 	Y	64	操作用户

    /**
     * 服务名称；ESB 路由的依据 ;--注释 伍鹏
     */
    private String serviceName;


	public String getBusinessSeqNo() {
		return businessSeqNo;
	}

	public void setBusinessSeqNo(String businessSeqNo) {
		this.businessSeqNo = businessSeqNo;
	}

	public String getTxDate() {
		return txDate;
	}

	public void setTxDate(String txDate) {
		this.txDate = txDate;
	}

	public String getTxTime() {
		return txTime;
	}

	public void setTxTime(String txTime) {
		this.txTime = txTime;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
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

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * 服务名称；ESB 路由的依据 ;--注释 伍鹏
     * @return
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * 服务名称；ESB 路由的依据 ;--注释 伍鹏
     * @return
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

	@Override
	public String toString() {
		return "ReqHeader [entityId=" + entityId + ", appId=" + appId + ", sessionId=" + sessionId + ", reqId=" + reqId
				+ ", accessToken=" + accessToken + ", businessSeqNo=" + businessSeqNo + ", txDate=" + txDate
				+ ", txTime=" + txTime + ", userId=" + userId + ", serviceName=" + serviceName + "]";
	}

    

}
