package com.zachary.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Zachary.Zheng 
 * @version 1.0
 * @date 2020年6月28日  下午11:49:49
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class ConcertConfig {

	@Bean
	public Audience audience() {
		return new Audience();
	}
}
