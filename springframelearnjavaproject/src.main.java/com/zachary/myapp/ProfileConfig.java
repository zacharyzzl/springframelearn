/**   
* @version V1.0  
*/  
package com.zachary.myapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

import com.zachary.soundsystem.impl.BlankDisc;

/**  
* @author Zachary.Zheng 
* @Description: TODO(这里用一句话描述这个类的作用)   
* @date 2020年6月26日  
*/
@Configuration
//@Import({DevelopmentProfileConfig.class, ProductionProfileConfig.class})
public class ProfileConfig {
	
	@Bean("blankDisc")
	@Profile("dev")
	public BlankDisc getDevBlankDisc() {
		BlankDisc blankDisc = new BlankDisc();
		blankDisc.setTitle("Sgt. Pepper's Lonely Hearts Club Band prod");
		List<String> tracks = new ArrayList<>();
		tracks.add("Sgt. Pepper's Lonely Hearts Club Band track prod");
		blankDisc.setTracks(tracks);
		return blankDisc;
	}
	
	@Bean("blankDisc")
	@Profile("prod")
	public BlankDisc getProdBlankDisc() {
		BlankDisc blankDisc = new BlankDisc();
		blankDisc.setTitle("Sgt. Pepper's Lonely Hearts Club Band prod");
		List<String> tracks = new ArrayList<>();
		tracks.add("Sgt. Pepper's Lonely Hearts Club Band track prod");
		blankDisc.setTracks(tracks);
		return blankDisc;
	}
}
