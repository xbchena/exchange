package com.iss.exchange.service;

public interface ExchangeEurekaRibbonClient {

	public String postPayBatchApp(String reqStr);
	public String postPaySingleApp(String reqStr);
	public String postPayRouteApp(String reqStr);
	public String postRecBatchApp(String reqStr);
	public String postRecSingleApp(String reqStr);
	public String postRecRouteApp(String reqStr);
}
