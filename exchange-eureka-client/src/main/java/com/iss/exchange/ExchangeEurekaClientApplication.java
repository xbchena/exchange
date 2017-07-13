package com.iss.exchange;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ExchangeEurekaClientApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ExchangeEurekaClientApplication.class).web(true).run(args); 
	}
}
