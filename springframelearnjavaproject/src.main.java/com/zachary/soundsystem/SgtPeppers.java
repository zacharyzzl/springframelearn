/**
 * 
 */
package com.zachary.soundsystem;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author Zachary.Zheng
 * @version 1.0
 * @date 2020年6月20日 下午9:31:16
 */
@Component
@Primary
public class SgtPeppers implements CompactDisc {

	private String title = "Sgt. Pepper's Lonely Hearts Club Band";
	private String artist = "The Beatles";

	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

}
