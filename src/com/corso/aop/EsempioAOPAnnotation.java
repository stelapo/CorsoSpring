package com.corso.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class EsempioAOPAnnotation {

    public void EsempioAOPAnnotation(){
        System.out.println("EsempioAOPAnnotation NEW" );
    }

    @Pointcut("execution(* com.corso.figure.*.* (..))") //&& args(lato)
    public void pointCutUnico(){}

    @Before("pointCutUnico()")
    public void beforeAdvice( JoinPoint jp) {
        System.out.println("EsempioAOPAnnotation beforeAdvice: prima del metodo :" + jp.getSignature() );
    }

    public void afterReturningAdvice( JoinPoint jp, Object result) {
        System.out.println("EsempioAOPAnnotation afterReturningAdvice: dopo il metodo :" + jp.getSignature() + " result = " + result );
    }

    public void afterThrowingAdvice(JoinPoint jp, Throwable error) throws Throwable {
        System.out.println("EsempioAOPAnnotation afterThrowingAdvice: dopo l'eccezione :" + jp.getSignature() + " error=" + error.getMessage());

    }

    public Object aroundAdvice(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("EsempioAOPAnnotation aroundAdvice: around 1 del metodo:" + jp.getSignature() );
        Object o = jp.proceed();
        System.out.println("EsempioAOPAnnotation aroundAdvice: around 2 del metodo:" + jp.getSignature() );
        return o;
    }
}
