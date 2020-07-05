/**   
* @version V1.0  
*/  
package com.zachary.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**  
* @author Zachary.Zheng 
* @version 1.0
* @date 2020年6月28日  下午11:24:00
*/
@Aspect
public class Audience {
	@Before("execution(* com.zachary.aop.Performance.perform(..))")
	public void silenceCellPhones() {
		System.out.println("Sliencing cell phones");
	}
	
	@Before("execution(* com.zachary.aop.Performance.perform(..))")
	public void takeSeats() {
		System.out.println("Taking seats");
	}
	
	@AfterReturning("execution(* com.zachary.aop.Performance.perform(..))")
	public void applause() {
		System.out.println("CLAP CLAP CLAP!!!");
	}
	
	@AfterThrowing("execution(* com.zachary.aop.Performance.perform(..))")
	public void demandRefund() {
		System.out.println("Demand a refund");
	}
}
