package com.iss.exchange.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@ConfigurationProperties(prefix = "exchange")
@Component
public class ExchangeRibbonConfig {
  
	/**
	 * 批量付款Application 名称
	 */
	@Value("${exchange.pay.batchApp}")
	private String exchangePayBatchApp;
	/**
	 * 单笔付款Application 名称
	 */
	@Value("${exchange.pay.singleApp}")
	private String exchangePaySingeApp;
	/**
	 * 路由付款Application 名称
	 */
	@Value("${exchange.pay.routeApp}")
	private String exchangePayRouteApp;
	/**
	 * 批量收款Application 名称
	 */
	@Value("${exchange.rec.batchApp}")
	private String exchangeRecBatchApp;
	/**
	 * 单笔收款Application 名称
	 */
	@Value("${exchange.rec.singleApp}")
	private String exchangeRecSingeApp;
	/**
	 * 路由收款Application 名称
	 */
	@Value("${exchange.rec.routeApp}")
	private String exchangeRecRouteApp;
	@Value("${exchange.connectionTime}")
	private String connectionTime;
	@Value("${exchange.readTime}")
	private String readTime;
	
	@Bean
	@LoadBalanced
	RestTemplate resTempLate(){
		RestTemplate rest = new RestTemplate();
		SimpleClientHttpRequestFactory factory  = (SimpleClientHttpRequestFactory)rest.getRequestFactory();
		factory.setReadTimeout(Integer.parseInt(this.getReadTime()));
		factory.setConnectTimeout(Integer.parseInt(this.getConnectionTime()));
		return new RestTemplate();
	}
	
	public String getExchangePayBatchApp() {
		return exchangePayBatchApp;
	}
	public void setExchangePayBatchApp(String exchangePayBatchApp) {
		this.exchangePayBatchApp = exchangePayBatchApp;
	}
	public String getExchangePaySingeApp() {
		return exchangePaySingeApp;
	}
	public void setExchangePaySingeApp(String exchangePaySingeApp) {
		this.exchangePaySingeApp = exchangePaySingeApp;
	}
	public String getExchangePayRouteApp() {
		return exchangePayRouteApp;
	}
	public void setExchangePayRouteApp(String exchangePayRouteApp) {
		this.exchangePayRouteApp = exchangePayRouteApp;
	}
	public String getExchangeRecBatchApp() {
		return exchangeRecBatchApp;
	}
	public void setExchangeRecBatchApp(String exchangeRecBatchApp) {
		this.exchangeRecBatchApp = exchangeRecBatchApp;
	}
	public String getExchangeRecSingeApp() {
		return exchangeRecSingeApp;
	}
	public void setExchangeRecSingeApp(String exchangeRecSingeApp) {
		this.exchangeRecSingeApp = exchangeRecSingeApp;
	}
	public String getExchangeRecRouteApp() {
		return exchangeRecRouteApp;
	}
	public void setExchangeRecRouteApp(String exchangeRecRouteApp) {
		this.exchangeRecRouteApp = exchangeRecRouteApp;
	}

	public String getConnectionTime() {
		return connectionTime;
	}

	public void setConnectionTime(String connectionTime) {
		this.connectionTime = connectionTime;
	}

	public String getReadTime() {
		return readTime;
	}

	public void setReadTime(String readTime) {
		this.readTime = readTime;
	}
	
}
