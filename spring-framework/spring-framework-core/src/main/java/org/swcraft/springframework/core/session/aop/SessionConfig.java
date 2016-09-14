package org.swcraft.springframework.core.session.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.swcraft.springframework.core.session.SessionManager;

@Configuration
@EnableAspectJAutoProxy
public class SessionConfig {

	@Bean
	public SessionManager fooService() {
		return new SessionManager();
	}

	@Bean
	public MeasureAspect measureAspect() {
		return new MeasureAspect();
	}

	@Bean
	public LoggingAspect loggingAspect() {
		return new LoggingAspect();
	}
}
