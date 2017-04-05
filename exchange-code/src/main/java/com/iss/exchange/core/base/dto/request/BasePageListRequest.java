package com.iss.exchange.core.base.dto.request;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.iss.exchange.core.base.dto.BaseRequest;
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)
public class BasePageListRequest extends BaseRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6634351514722333614L;
	/**
     * 第几页 0开始
     */
    private int pageNum ;

    /**
     * 一页返回多少条
     */
    private int pageSize ;

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	
	public String toString(){
		return "{page info:[pageNum:"+pageNum +",pageSize:"+pageSize+"]}";
	}

}
