package com.zachary.soundsystem.impl;

import java.util.List;

import com.zachary.soundsystem.CompactDisc;

/**
 * @author Zachary.Zheng
 * @version 1.0
 * @date 2020年6月22日 下午9:48:56
 */
public class BlankDisc implements CompactDisc {

	public String title;
	public String artist;
	public List<Object> tracks;

	public BlankDisc(String title, String artist, List<Object> tracks) {
		this.title = title;
		this.artist = artist;
		this.tracks = tracks;
	}

	public BlankDisc() {
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setTracks(List<Object> tracks) {
		this.tracks = tracks;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
		for (Object track : tracks) {
			System.out.println("-Tracks" + " : " + track);
		}
	}
}
