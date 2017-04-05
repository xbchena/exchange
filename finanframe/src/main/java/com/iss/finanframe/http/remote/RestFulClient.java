package com.iss.finanframe.http.remote;

import java.util.Map;

import com.alibaba.fastjson.JSONObject;

public interface RestFulClient {

    /**
     * rest远程调用
     * @param params
     * @param operationType
     * @return
     * @throws Exception
     */
    public String revsRemoteCall(String url,JSONObject params, int timeout,String contentType) throws Exception;
}
