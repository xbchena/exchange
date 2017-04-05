package com.iss.finanframe.message.kafka;

import java.util.Properties;

public class MyKafkaProperty extends Properties{

	private static final long serialVersionUID = -4702209196497416632L;
	
	public MyKafkaProperty(Properties defaults) {
		defaults.put("client.id", String.valueOf(System.currentTimeMillis() % 50000));
		this.putAll(defaults);
    }
}
