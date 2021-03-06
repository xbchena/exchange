package com.iss.exchange.pay.single;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ExchangePaySingleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExchangePaySingleApplication.class, args);
	}
}
