package org.swcraft.springframework.core.configuration.xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "hello-beans.xml" });
		HelloWorld obj = context.getBean(HelloWorld.class);
		// HelloWorld obj = context.getBean("helloWorld", HelloWorld.class);
		obj.printMessage();

		context.close();
	}
}
