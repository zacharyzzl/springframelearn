/**   
* @version V1.0  
*/  
package com.zachary.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sun.xml.internal.bind.CycleRecoverable.Context;

/**  
* @author Zachary.Zheng 
* @version 1.0
* @date 2020年6月28日  下午11:55:37
*/
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = ConcertConfig.class)
@ContextConfiguration(locations = "classpath:aop-config.xml")
public class ConcertConfigTest {

	/*Spring 有两种代理动态代理模式，一种是基于接口的JDK动态地理，一种是基于类的CGLibs动态代理，Spring默认是使用JDK动态代理的，所以要么使用JDK动态代理，要么使用CGLibs实现动态代理。
	　　解决方法：
	　1、使用基于接口的JDK动态代理：将测试代码中的
	　　　PerformanceImpl performance = apx.getBean("performance",PerformanceImpl.class);
	　　　改为
	　　　Performance performance = apx.getBean("performance", Performance.class);
	  2、使用基于类的CGLIBS动态代理：在配置文件中添加
	  　　<aop:aspectj-autoproxy proxy-target-class="true"/>强制使用类代理模式。
	 */
//	@Autowired
//	private Performance concert;
	
//	@Autowired
//	private Encoreable encoreableIntroducer;
	
	@Test
	public void test() {
//		AbstractApplicationContext context = new FileSystemXmlApplicationContext("classpath:aop-config.xml");
//		Performance concert = (Performance) context.getBean("concert");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConcertConfig.class);
		Performance concert = (Performance) context.getBean("concert");
		Encoreable defaultEncoreable = (Encoreable) concert;
		concert.perform("perform1");
		defaultEncoreable.performEncore();
		context.close();
	}

}
