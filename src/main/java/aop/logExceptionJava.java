package aop;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class logExceptionJava {
	@AfterThrowing(pointcut = "execution(* quach.Application.*(..))", throwing = "e")
	public void logException(Exception e) throws Throwable {
		System.out.println("****TestingLogException() " + e);

	}
	
	@Before("handler(*) && args(e)")
    public void logCaughtException(Exception e) {
		System.out.println("****TestingLogCaughtException() " + e);
    }
}