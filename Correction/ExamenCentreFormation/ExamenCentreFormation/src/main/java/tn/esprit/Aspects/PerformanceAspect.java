package tn.esprit.Aspects;

import java.util.ArrayList;
import java.util.List;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Aspect
@Slf4j
public class PerformanceAspect {


//	@Around("execution(* tn.esprit.services.*.*(..))")
//	public Object executionTime(ProceedingJoinPoint pjp) throws Throwable {
//		
//		long t1 = System.currentTimeMillis(); 
//		Object obj = pjp.proceed(); 
//		long executionTime = System.currentTimeMillis() - t1;
//
//		log.info("Method execution time: " + executionTime + " milliseconds.");
//		
//		return obj; 
//	}
	
}
