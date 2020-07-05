/**   
* @version V1.0  
*/  
package com.zachary.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
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
	@Pointcut("execution(* com.zachary.aop.Performance.perform(..))")
	public void performance() {};
	
	@Before("performance()")
	public void silenceCellPhones() {
		System.out.println("Sliencing cell phones");
	}
	
	@Before("performance()")
	public void takeSeats() {
		System.out.println("Taking seats");
	}
	
	@AfterReturning("performance()")
	public void applause() {
		System.out.println("CLAP CLAP CLAP!!!");
	}
	
	@AfterThrowing("performance()")
	public void demandRefund() {
		System.out.println("Demand a refund");
	}
}
