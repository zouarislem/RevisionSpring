package tn.esprit.examenblanc.Configuration;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class AspectLog {
    @AfterReturning(value = "execution(* tn.esprit.examenblanc.Services.*.*(String))")
    void journal(JoinPoint joinPoint){
        String name=joinPoint.getSignature().getName();
        log.info("La methode "+name+" a utilise un string comme parametre");
    }
}
