package com.zachary.soundsystem.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zachary.soundsystem.CompactDisc;
import com.zachary.soundsystem.MediaPlayer;

/**
 * @author Zachary.Zheng
 * @version 1.0
 * @date 2020年6月21日 下午3:17:35
 */
@Component
public class CDPlayer implements MediaPlayer {

	private CompactDisc cd;

//	@Autowired
//	public CDPlayer(CompactDisc cd) {
//		this.cd = cd;
//	}

//	@Autowired
//	public void setCd(CompactDisc cd) {
//		this.cd = cd;
//	}

	@Autowired
	public void insertCd(CompactDisc cd) {
		this.cd = cd;
	}

	@Override
	public void play() {
		cd.play();
	}
}
