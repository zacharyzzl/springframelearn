package com.zachary.soundsystem;

import static org.junit.Assert.assertNotNull;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Zachary.Zheng
 * @version 1.0
 * @date 2020年6月20日 下午9:47:04
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig2.class)
public class CDPlayerConfigTest2 {
	
	@Autowired
	@Qualifier("sgtPeppers")
	private CompactDisc sgtPeppers;
	
	@Inject
	@Qualifier("jay")
	private CompactDisc jay;

	@Test
	public void cdShouldNotBeNullTest() {
		sgtPeppers.play();
		jay.play();
		assertNotNull(sgtPeppers);
	}

}
