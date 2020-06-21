package com.zachary.soundsystem.impl;

import com.zachary.soundsystem.CompactDisc;
import com.zachary.soundsystem.MediaPlayer;

/**
 * @author Zachary.Zheng
 * @version 1.0
 * @date 2020年6月21日 下午3:17:35
 */
public class CDPlayer implements MediaPlayer {
	private CompactDisc cd;

	@Override
	public void play() {
		cd.play();
	}

	public void setCd(CompactDisc cd) {
		this.cd = cd;
	}
}
