package org.swcraft.springframework.core.session.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	@Before("execution(* org.swcraft.springframework.core.session.SessionManager.*(..))")
	public void before(JoinPoint joinPoint) throws Throwable {
		System.out.println("Method called: " + joinPoint.getSignature().getName());
		System.out.println("Parameters: " + Arrays.toString(joinPoint.getArgs()));
	}

	@Around("execution(* org.swcraft.springframework.core.session.SessionManager.*(..))")
	public Object logReturnValue(ProceedingJoinPoint pjp) throws Throwable {
		Object returnValue = pjp.proceed();
		System.out.println("Method finished: " + pjp.getSignature().getName() + ", returning " + returnValue);
		return returnValue;
	}
}
