package com.zachary.myapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.zachary.soundsystem.impl.BlankDisc;

/**
 * @author Zachary.Zheng
 * @version 1.0
 * @date 2020年6月22日 下午11:06:18
 */
@Configuration
@Profile("dev")
public class DevelopmentProfileConfig {

	@Bean("blankDisc")
	public BlankDisc getBlankDisc() {
		BlankDisc blankDisc = new BlankDisc();
		blankDisc.setTitle("Sgt. Pepper's Lonely Hearts Club Band dev");
		List<Object> tracks = new ArrayList<>();
		tracks.add("Sgt. Pepper's Lonely Hearts Club Band track dev");
		blankDisc.setTracks(tracks);
		return blankDisc;
	}
}
