package org.swcraft.springframework.core.configuration.auto;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MovieAutoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MovieAutoConfig.class);
		context.registerShutdownHook();
		MovieListerService service = context.getBean(MovieListerService.class);
		service.listAll();
	}
}
