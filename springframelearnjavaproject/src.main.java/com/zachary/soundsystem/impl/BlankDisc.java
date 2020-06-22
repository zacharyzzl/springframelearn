package com.zachary.soundsystem.impl;

import java.util.List;

import com.zachary.soundsystem.CompactDisc;

/**
 * @author Zachary.Zheng
 * @version 1.0
 * @date 2020年6月22日 下午9:48:56
 */
public class BlankDisc implements CompactDisc {

	private String title;
	private String artist = "The Beatles";
	private List<String> tracks;

	public void setTitle(String title) {
		this.title = title;
	}

	public void setTracks(List<String> tracks) {
		this.tracks = tracks;
	}

	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
		for (String track : tracks) {
			System.out.println("-Tracks" + track);
		}
	}
}
