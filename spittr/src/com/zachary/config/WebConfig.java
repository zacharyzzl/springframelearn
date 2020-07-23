/**   
* @version V1.0  
*/  
package com.zachary.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**  
* @author Administrator 
* @version 1.0
* @date 2020年7月23日  下午9:11:49
*/
@Configuration
@EnableWebMvc // 启用SpringMVC
@ComponentScan("com.zachary") // 启用组件扫描
public class WebConfig extends WebMvcConfigurerAdapter {
	/**
	 * 配置JSP视图解析器
	 * 
	 * @Title: viewResolver  
	 * @Description: TODO
	 * @param @return    参数  
	 * @return ViewResolver    返回类型  
	 * @throws
	 */
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		resolver.setExposeContextBeansAsAttributes(true);
		return resolver;
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
}
