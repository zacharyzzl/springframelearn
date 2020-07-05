/**   
* @version V1.0  
*/  
package com.zachary.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**  
* @author Zachary.Zheng 
* @version 1.0
* @date 2020年6月28日  下午11:24:00
*/
@Aspect
public class Audience {
	@Pointcut("execution(* com.zachary.aop.Performance.perform(..))")
	public void performance() {};
	
	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint jp) {
		try {
			System.out.println("Sliencing cell phones");
			System.out.println("Taking seats");
			jp.proceed();
			System.out.println("CLAP CLAP CLAP!!!");
			System.out.println("Demand a refund");
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
