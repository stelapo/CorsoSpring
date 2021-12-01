package com.corso.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;


public class EsempioAOP  {

//	private final Logger loggger = new Logger();

	
	public void beforeAdvice( JoinPoint jp) {
	        System.out.println("beforeAdvice: prima del metodo :" + jp.getSignature() );
	}

	public void afterReturningAdvice( JoinPoint jp, Object result) {
		System.out.println("afterReturningAdvice: dopo il metodo :" + jp.getSignature() + " result = " + result );
	}

	public void afterThrowingAdvice(JoinPoint jp, Throwable error) throws Throwable {
		System.out.println("afterThrowingAdvice: dopo l'eccezione :" + jp.getSignature() + " error=" + error.getMessage());

	}

	public Object aroundAdvice(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("aroundAdvice: around 1 del metodo:" + jp.getSignature() );
		Object o = jp.proceed();
		System.out.println("aroundAdvice: around 2 del metodo:" + jp.getSignature() );
		return o;
	}

	
	
	
	
	
	
/*	
    @Around("execution(* *(..)) && @annotation(loggable)")
    public Object loggingAroundMethod( ProceedingJoinPoint jp,
                                       Loggable loggable) throws Throwable {
        final String signature = jp.getTarget().getClass().getName() + '.' + jp.getSignature().getName();
        final List<Object> arguments = Arrays.asList(jp.getArgs());

        final Object result;
        try {
            doLog(loggable.level(), "[BEFORE] {}{}", signature, arguments);
            result = jp.proceed();
            doLog(loggable.level(), "[AFTER] {}{} result={}", signature, arguments, result);
        } catch (Exception e) {
        	loggger.log("[AFTER] {}{} exception={}", signature, arguments, e);
            throw e;
        }

        return result;
    }
	
    private void doLog(final Loggable.Level level, final String format, final Object... arguments) {
        switch (level) {
            case DEBUG:
            	loggger.log(format, arguments);
                return;

            case INFO:
            	loggger.log(format, arguments);
                return;

            case WARN:
            	loggger.log(format, arguments);
                return;

            case ERROR:
                break;

            default:
            	loggger.log("Unable to appropriately handle given log level={}", level);
        }
        loggger.log(format, arguments);
    }
    */
    
}
    
