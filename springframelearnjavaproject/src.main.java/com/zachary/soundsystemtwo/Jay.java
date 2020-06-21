/**
 * 
 */
package com.zachary.soundsystemtwo;

import javax.inject.Named;

import com.zachary.soundsystem.CompactDisc;

/**
 * @author Zachary.Zheng
 * @version 1.0
 * @date 2020年6月21日 下午2:34:03
 */
@Named("jay")
public class Jay implements CompactDisc {
	
	private String title = "jay";
	private String artist = "周杰伦";
	
	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}
}
