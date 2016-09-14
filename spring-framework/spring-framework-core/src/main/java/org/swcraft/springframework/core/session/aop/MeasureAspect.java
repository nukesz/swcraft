package org.swcraft.springframework.core.session.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MeasureAspect {

	@Around("execution(* org.swcraft.springframework.core.session.SessionManager.*(..))")
	public Object measureTime(ProceedingJoinPoint pjp) throws Throwable {
		long startTime = System.currentTimeMillis();
		try {
			return pjp.proceed();
		} finally {
			long elapsedTime = System.currentTimeMillis() - startTime;
			System.out.println("Elapsed time " + pjp.getSignature().getName() + ":" + elapsedTime);
		}
	}
}
