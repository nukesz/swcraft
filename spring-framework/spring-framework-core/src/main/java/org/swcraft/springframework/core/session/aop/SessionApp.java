package org.swcraft.springframework.core.session.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.swcraft.springframework.core.session.SessionManager;

public class SessionApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(SessionConfig.class);
		context.registerShutdownHook();

		SessionManager manager = context.getBean(SessionManager.class);
		String session = manager.createSession();
		System.out.println("session = " + session);
		// Testing valid session
		System.out.println("sessionValid = " + manager.isSessionValid(session));

		// Testing invalid session
		System.out.println("sessionValid = " + manager.isSessionValid("invalid session"));

		// Invalidate session
		manager.invalidateSession(session);
		System.out.println("sessionValid = " + manager.isSessionValid(session));
	}
}
