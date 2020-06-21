package com.zachary.soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Zachary.Zheng
 * @version 1.0
 * @date 2020年6月20日 下午9:47:04
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:cd-config.xml")
public class CDPlayerConfigTest {

	@Autowired
	private CompactDisc sgtPeppers;

	@Autowired
	private MediaPlayer cd;

	@Test
	public void cdShouldNotBeNullTest() {
//		AbstractApplicationContext context = new FileSystemXmlApplicationContext("classpath*:cd-config.xml");// 获得上下文
//		CompactDisc sgtPeppers = context.getBean(CompactDisc.class);// 从上下文中获得bean
//		sgtPeppers.play();
//		context.close();
		sgtPeppers.play();
		cd.play();
	}

}
