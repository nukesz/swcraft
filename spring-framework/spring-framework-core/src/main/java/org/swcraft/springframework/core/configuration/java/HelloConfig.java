package org.swcraft.springframework.core.configuration.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.swcraft.springframework.core.configuration.xml.HelloWorld;

@Configuration
public class HelloConfig {

	@Bean
	public HelloWorld hello() {
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setMessage("Hello from configuration!");
		return helloWorld;
	}
}
