package org.swcraft.springframework.core.configuration.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.swcraft.springframework.core.configuration.xml.HelloWorld;

public class HelloWorldAnnotationApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(HelloConfig.class);
		HelloWorld obj = context.getBean(HelloWorld.class);
		obj.printMessage();
		context.close();
	}
}
