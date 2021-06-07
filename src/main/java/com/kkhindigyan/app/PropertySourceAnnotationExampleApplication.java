package com.kkhindigyan.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.kkhindigyan.app.config.MyConfig1;
import com.kkhindigyan.app.config.MyConfig2;

@SpringBootApplication
public class PropertySourceAnnotationExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(PropertySourceAnnotationExampleApplication.class, args);
		MyConfig1 myConfig1 = applicationContext.getBean(MyConfig1.class);
		myConfig1.readProps();
		System.out.println("-------------------------------------");
		MyConfig2 myConfig2 = applicationContext.getBean(MyConfig2.class);
		myConfig2.readProps();
		
	}

}
