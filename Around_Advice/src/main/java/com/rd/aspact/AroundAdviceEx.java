package com.rd.aspact;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class AroundAdviceEx{
    //this is for only one method
	//@Around("execution(public void deposit(int,int))")
	
//	this is for all methods that belongs to that class
@Around("execution(* com.rd.service.*.*(..))")	
	public void log(ProceedingJoinPoint pjp) throws Throwable
	{
		System.out.println("this is before method execution");
		pjp.proceed();
		System.out.println("this is after method execution");
	}
	
}

//public class AroundAdviceEx implements MethodInterceptor  {
//
//	public Object invoke(MethodInvocation invocation) throws Throwable {
//		
//	System.out.println("this is before advice");
//	Object ob=invocation.proceed();
//	System.out.println("this is after advice");
//	return ob;
//	}
//
//}
