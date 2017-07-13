package com.iss.exchange;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.iss.exchange.eureka.server.ExchangeEurekaServerApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ExchangeEurekaServerApplication.class)
@WebAppConfiguration
public class ExchangeEurekaServerApplicationTests {

	@Test
	public void contextLoads() {
	}

}
