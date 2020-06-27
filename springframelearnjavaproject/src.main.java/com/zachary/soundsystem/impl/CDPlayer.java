package com.zachary.soundsystem.impl;

import java.util.List;

import com.zachary.soundsystem.CompactDisc;
import com.zachary.soundsystem.MediaPlayer;

/**
 * @author Zachary.Zheng
 * @version 1.0
 * @date 2020年6月21日 下午3:17:35
 */
public class CDPlayer implements MediaPlayer {
	private CompactDisc cd;
	public List<CompactDisc> cds;

	public CDPlayer(CompactDisc cd, List<CompactDisc> cds) {
		this.cd = cd;
		this.cds = cds;
	}

	@Override
	public void play() {
		cd.play();
	}

	public void setCd(CompactDisc cd) {
		this.cd = cd;
	}

	@Override
	public String toString() {
		return "CDPlayer [cd=" + cd + ", cds=" + cds + "]";
	}
}
