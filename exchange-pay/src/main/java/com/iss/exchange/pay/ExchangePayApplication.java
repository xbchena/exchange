package com.iss.exchange.pay;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
@ServletComponentScan
public class ExchangePayApplication {

	public static Logger logger = LoggerFactory.getLogger(ExchangePayApplication.class);
	
	public static void main(String[] args) {
		try {
			logger.info("ExchangePayApplication 开始启动" );
			SpringApplication.run(ExchangePayApplication.class, args);
			logger.info("ChannelServerApplication 已经启动");
			System.out.println(args.toString());
		} catch (Exception e) {
			e.getMessage();
			logger.error(e.getMessage());
		}
	}

}
