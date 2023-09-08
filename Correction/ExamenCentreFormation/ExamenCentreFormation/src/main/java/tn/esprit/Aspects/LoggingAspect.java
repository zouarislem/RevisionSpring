package tn.esprit.Aspects;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Aspect
@Slf4j
public class LoggingAspect {

	@AfterReturning("execution(* tn.esprit.services.*.*(..))")
	public void logMethod(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		log.info("out of method  :" + name);
	}



}
