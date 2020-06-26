package com.zachary.soundsystem.impl;

import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zachary.soundsystem.CDPlayerConfig;
import com.zachary.soundsystem.CompactDisc;
import com.zachary.soundsystem.MediaPlayer;

/**
 * @author Zachary.Zheng
 * @version 1.0
 * @date 2020年6月21日 下午3:54:20
 */
@SuppressWarnings("deprecation")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

	@Rule
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();

	@Autowired(required = false)
	private MediaPlayer player;

	@Autowired(required = false)
	private CompactDisc cd;

	@Test
	public void cdShouldNotBeNull() {
		cd.play();
		assertNotNull(cd);
	}

	@Test
	public void play() {
		player.play();
		System.out.println(log.getLog());
	}

}
