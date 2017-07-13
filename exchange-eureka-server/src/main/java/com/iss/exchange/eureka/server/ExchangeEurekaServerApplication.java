package com.iss.exchange.eureka.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ExchangeEurekaServerApplication {

	public static void main(String[] args) {
		
		new SpringApplicationBuilder(ExchangeEurekaServerApplication.class).web(true).run(args);
	}
}
