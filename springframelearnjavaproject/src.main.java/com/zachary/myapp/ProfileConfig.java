/**   
* @version V1.0  
*/  
package com.zachary.myapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.zachary.soundsystem.impl.BlankDisc;

/**  
* @author Zachary.Zheng 
* @Description: TODO(这里用一句话描述这个类的作用)   
* @date 2020年6月26日  
*/
@Configuration
@Import({DevelopmentProfileConfig.class, ProductionProfileConfig.class})
public class ProfileConfig {
	
	@Bean("blankDisc1")
	@Profile("dev")
	@Primary
	public BlankDisc getDevBlankDiscPrimary() {
		BlankDisc blankDisc = new BlankDisc();
		blankDisc.setTitle("Sgt. Pepper's Lonely Hearts Club Band dev Primary");
		List<String> tracks = new ArrayList<>();
		tracks.add("Sgt. Pepper's Lonely Hearts Club Band track dev Primary");
		blankDisc.setTracks(tracks);
		return blankDisc;
	}
	@Bean("blankDisc2")
	@Profile("dev")
	@Qualifier("Qualifier")
	public BlankDisc getDevBlankDiscQualifier() {
		BlankDisc blankDisc = new BlankDisc();
		blankDisc.setTitle("Sgt. Pepper's Lonely Hearts Club Band dev Qualifier");
		List<String> tracks = new ArrayList<>();
		tracks.add("Sgt. Pepper's Lonely Hearts Club Band track dev Qualifier");
		blankDisc.setTracks(tracks);
		return blankDisc;
	}
	@Bean("blankDisc3")
	@Profile("dev")
	@Creamy
	@Cold
	public BlankDisc getDevBlankDiscCreamyCold() {
		BlankDisc blankDisc = new BlankDisc();
		blankDisc.setTitle("Sgt. Pepper's Lonely Hearts Club Band dev Cold+Creamy");
		List<String> tracks = new ArrayList<>();
		tracks.add("Sgt. Pepper's Lonely Hearts Club Band track dev Cold+Creamy");
		blankDisc.setTracks(tracks);
		return blankDisc;
	}
	
	@Bean("blankDisc4")
	@Profile("prod")
	public BlankDisc getProdBlankDisc() {
		BlankDisc blankDisc = new BlankDisc();
		blankDisc.setTitle("Sgt. Pepper's Lonely Hearts Club Band prod");
		List<String> tracks = new ArrayList<>();
		tracks.add("Sgt. Pepper's Lonely Hearts Club Band track prod");
		blankDisc.setTracks(tracks);
		return blankDisc;
	}
	
	@Bean("blankDisc5")
	@Conditional(ProfileCondition.class)
	public BlankDisc getBlankDiscByProfileCondition() {
		BlankDisc blankDisc = new BlankDisc();
		blankDisc.setTitle("Sgt. Pepper's Lonely Hearts Club Band prod");
		List<String> tracks = new ArrayList<>();
		tracks.add("Sgt. Pepper's Lonely Hearts Club Band track prod");
		blankDisc.setTracks(tracks);
		return blankDisc;
	}
	
	@Bean("blankDisc6")
	@Conditional(MagicExistsCondition.class)
	public BlankDisc getBlankDiscByMagicExistsCondition() {
		BlankDisc blankDisc = new BlankDisc();
		blankDisc.setTitle("Sgt. Pepper's Lonely Hearts Club Band magic");
		List<String> tracks = new ArrayList<>();
		tracks.add("Sgt. Pepper's Lonely Hearts Club Band track magic");
		blankDisc.setTracks(tracks);
		return blankDisc;
	}
}
