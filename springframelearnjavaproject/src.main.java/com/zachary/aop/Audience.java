/**   
* @version V1.0  
*/  
package com.zachary.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**  
* @author Zachary.Zheng 
* @version 1.0
* @date 2020年6月28日  下午11:24:00
*/
public class Audience {
	public void performance(String performContent) {};
	
	public void sliencingPhones(String performContent){
		System.out.println(performContent);
		System.out.println("Sliencing cell phones");
	}
	
	public void watchPerformance(ProceedingJoinPoint jp, String performContent) {
		try {
			System.out.println("Taking seats");
			System.out.println(performContent);
			jp.proceed();
			System.out.println("CLAP CLAP CLAP!!!");
		} catch (Throwable e) {
			System.out.println("Demand a refund");
			e.printStackTrace();
		}
	}
}
