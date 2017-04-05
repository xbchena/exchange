package com.iss.exchange.core.base.dto.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.iss.exchange.core.base.dto.BaseResponse;
import com.iss.exchange.core.base.dto.request.BasePageListRequest;
import com.iss.exchange.core.common.ExchangeReturnCode;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)
public class BasePageListResponse extends BaseResponse{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    /**
	 * @param request
	 */
    public BasePageListResponse(BasePageListRequest request) {
        super(request);
        if (request != null) {
            this.pageNum = request.getPageNum();
            this.pageSize = request.getPageSize();
        }
    }
    
    public BasePageListResponse(BasePageListRequest request,ExchangeReturnCode uppReturnCode) {
        super(request,uppReturnCode);
        if (request != null) {
            this.pageNum = request.getPageNum();
            this.pageSize = request.getPageSize();
        }
    }    
    public BasePageListResponse(BasePageListRequest request,ExchangeReturnCode uppReturnCode,String resMessageExt) {
        super(request,uppReturnCode,resMessageExt);
        if (request != null) {
            this.pageNum = request.getPageNum();
            this.pageSize = request.getPageSize();
        }
    }
    
    /**
     * 第几页 0开始
     */
    private int pageNum;

    /**
     * 一页返回多少条
     */
    private int pageSize;
    
    /**
     * 总共多少页
     */
    private int pages;   
	
    /**
     * 总数
     */
    private long total;
    
	/**
     * 第几页 0开始
     *
     * @return
     */
    public int getPageNum() {
        return pageNum;
    }

    /**
     * 第几页 0开始
     *
     * @param pageNum
     */
    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }


    /**
     * 一页返回多少条
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * 一页返回多少条
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

}
