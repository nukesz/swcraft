package org.swcraft.springframework.core.configuration.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.swcraft.springframework.core.configuration.xml.SimpleMovieLister;

public class MovieAnnotationApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(MovieConfig.class);
		context.registerShutdownHook();

		SimpleMovieLister movieLister = context.getBean(SimpleMovieLister.class);
		movieLister.listAll();
	}
}
