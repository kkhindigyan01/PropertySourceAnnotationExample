package com.kkhindigyan.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

@Configuration
@PropertySources(value = { @PropertySource(value = { "classpath:myconfig1.properties" }),
		@PropertySource(value = { "classpath:myconfig2.properties" }) })
public class MyConfig1 {

	@Autowired
	private Environment environment;
	
	public void readProps() {
		
		String p1 = environment.getProperty("my.channel.name");
		String p2 = environment.getProperty("my.website.url");
		System.out.println(p1+"\t"+p2);
		
		String p3 = environment.getProperty("my.lucky.number");
		System.out.println(p3);
	}
}
