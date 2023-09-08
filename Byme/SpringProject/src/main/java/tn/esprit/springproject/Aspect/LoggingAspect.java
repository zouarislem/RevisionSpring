package tn.esprit.springproject.Aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component // pour dire c'est un composant teba3 le work lekher
@Aspect // AOP
@Slf4j //instance mel log
public class LoggingAspect {
    @After("execution(* tn.esprit.springproject.Services.*.add*(..))")
    public void LongMethodEntry(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        log.info("After method" + name);
    }

    @Around("execution(* tn.esprit.springproject.Services.*.addSkieur(..))")
    public Object profile(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        Object obj = pjp.proceed();
        long elapsedTime = System.currentTimeMillis() - start;
        log.info("Method execution time: " + elapsedTime + " milliseconds.");
        return obj;
    }
}
