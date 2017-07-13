package com.iss.exchange.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.iss.exchange.config.ExchangeRibbonConfig;
import com.iss.exchange.service.ExchangeEurekaRibbonClient;

@Service
public class ExchangeEurekaRibbonClientImpl implements ExchangeEurekaRibbonClient {
	@Autowired
	private RestTemplate tempLate;
	@Autowired
	private ExchangeRibbonConfig config;
	
	@Override
	public String postPayBatchApp(String reqStr) {
		// TODO Auto-generated method stub
		return tempLate.postForObject(config.getExchangePayBatchApp(), reqStr, String.class);
	}


	@Override
	public String postPaySingleApp(String reqStr) {
		// TODO Auto-generated method stub
		return tempLate.postForObject(config.getExchangePaySingeApp(), reqStr, String.class);
	}


	@Override
	public String postPayRouteApp(String reqStr) {
		// TODO Auto-generated method stub
		return tempLate.postForObject(config.getExchangePayRouteApp(), reqStr, String.class);
	}


	@Override
	public String postRecBatchApp(String reqStr) {
		// TODO Auto-generated method stub
		return tempLate.postForObject(config.getExchangeRecBatchApp(), reqStr, String.class);
	}


	@Override
	public String postRecSingleApp(String reqStr) {
		// TODO Auto-generated method stub
		return tempLate.postForObject(config.getExchangeRecSingeApp(), reqStr, String.class);
	}


	@Override
	public String postRecRouteApp(String reqStr) {
		// TODO Auto-generated method stub
		return tempLate.postForObject(config.getExchangeRecRouteApp(), reqStr, String.class);
	}

}
