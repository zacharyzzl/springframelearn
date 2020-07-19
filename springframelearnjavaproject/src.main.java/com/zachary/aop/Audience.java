/**   
* @version V1.0  
*/  
package com.zachary.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**  
* @author Zachary.Zheng 
* @version 1.0
* @date 2020年6月28日  下午11:24:00
*/
@Aspect
public class Audience {
	@Pointcut("execution(* com.zachary.aop.Performance.perform(String)) && args(performContent)")
	public void performance(String performContent) {};
	
	@Before("performance(performContent)")
	public void sliencingPhones(String performContent){
		System.out.println(performContent);
		System.out.println("Sliencing cell phones");
	}
	
	@Around("performance(performContent)")
	public void watchPerformance(ProceedingJoinPoint jp, String performContent) {
		try {
			System.out.println("Taking seats");
			jp.proceed();
			System.out.println("CLAP CLAP CLAP!!!");
		} catch (Throwable e) {
			System.out.println("Demand a refund");
			e.printStackTrace();
		}
	}
}
