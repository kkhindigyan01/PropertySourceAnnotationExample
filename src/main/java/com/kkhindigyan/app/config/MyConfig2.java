package com.kkhindigyan.app.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = { "classpath:myconfig1.properties" })
public class MyConfig2 {

	@Value(value = "${my.channel.name}")
	private String myChannelName;
	
	@Value(value = "${my.website.url}")
	private String myWebsiteUrl;
	
	public void readProps() {
		System.out.println(myChannelName);
		System.out.println(myWebsiteUrl);
	}
	
}
