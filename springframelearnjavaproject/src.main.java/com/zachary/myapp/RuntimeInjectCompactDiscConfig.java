package com.zachary.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.env.Environment;

/**
 * @author Zachary.Zheng
 * @version 1.0
 * @date 2020年6月27日
 */
@Configuration
//@PropertySource("classpath:app.properties")
@ImportResource("classpath:cd-config.xml")
public class RuntimeInjectCompactDiscConfig {

	@Autowired
	Environment env;

//	@Bean
//	static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
//		return new PropertySourcesPlaceholderConfigurer();
//	}

//	@Bean
//	@Qualifier("setBlankDisc")
//	public BlankDisc setBlankDisc() {
//		BlankDisc blankDisc = new BlankDisc();
//		blankDisc.setTitle(env.getProperty("disc.title"));
//		blankDisc.setArtist(env.getProperty("disc.artist"));
//		blankDisc.setTracks(new ArrayList<>());
//		return blankDisc;
//	}
//
//	@Bean
//	@Qualifier("setBlankDisc2")
//	public BlankDisc setBlankDisc2(@Value("${disc.title}") String title, @Value("${disc.artist}") String aritst) {
//		BlankDisc blankDisc = new BlankDisc();
//		blankDisc.setTitle(title + "setBlankDisc2");
//		blankDisc.setArtist(aritst + "setBlankDisc2");
//		blankDisc.setTracks(new ArrayList<>());
//		return blankDisc;
//	}

}
