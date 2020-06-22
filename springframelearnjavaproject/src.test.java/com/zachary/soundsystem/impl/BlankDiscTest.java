package com.zachary.soundsystem.impl;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zachary.soundsystem.CompactDisc;

/**
 * @author Zachary.Zheng
 * @version 1.0
 * @date 2020年6月22日 下午9:53:00
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:cd-config.xml")
public class BlankDiscTest {

	@Autowired
	private CompactDisc cd;

	@Test
	public void cdShouldNotBeNull() {
		cd.play();
		assertNotNull(cd);
	}

}
