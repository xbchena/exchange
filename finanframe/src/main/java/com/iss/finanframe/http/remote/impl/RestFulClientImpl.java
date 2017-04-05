package com.iss.finanframe.http.remote.impl;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.iss.finanframe.http.client.HttpclientUtil;
import com.iss.finanframe.http.remote.RestFulClient;



public class RestFulClientImpl implements RestFulClient {


    private static final int  DEFAULT_TIMEOUT = 300;

    public String revsRemoteCall(String url,JSONObject params, int timeout,String contentType) throws Exception {
        if (timeout <= 0) {
        	timeout = DEFAULT_TIMEOUT;
        }
        String returnStr = HttpclientUtil
            .post(url, params, "utf-8", timeout,contentType);
        //SONObject.parseObject(returnStr)
        return returnStr;
    }

    public Map<String, String> getJsonToStringMapMap(JSONObject json) {
        Map<String, String> params = new HashMap<String, String>();
        for (Map.Entry<String, Object> obj : json.entrySet()) {
            if (obj.getValue() != null) {
                params.put(obj.getKey(), obj.getValue().toString());
            } else {
                params.put(obj.getKey(), null);
            }
        }
        return params;
    }
}
