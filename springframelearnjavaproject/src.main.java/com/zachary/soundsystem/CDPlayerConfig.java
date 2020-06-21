package com.zachary.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zachary.soundsystem.impl.CDPlayer;

/**
 * @author Zachary.Zheng
 * @version 1.0
 * @date 2020年6月20日 下午9:41:29
 */
@Configuration
public class CDPlayerConfig {

	/**
	 * bean的ID默认与方法名相同
	 * 
	 * @return
	 */
	@Bean
	public CompactDisc sgtPeppers() {
		return new SgtPeppers();
	}

	@Bean
	public MediaPlayer cdPlayer(CompactDisc compactDisc) {
		CDPlayer cdPlayer = new CDPlayer();
		cdPlayer.setCd(compactDisc);
		return cdPlayer;
	}
}
