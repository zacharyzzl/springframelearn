/**   
* @version V1.0  
*/  
package com.zachary.myapp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zachary.soundsystem.impl.BlankDisc;

/**  
* @author Zachary.Zheng 
* @Description: TODO(这里用一句话描述这个类的作用)   
* @date 2020年6月26日  
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ProfileConfig.class)
@ActiveProfiles("magic")
public class ProfileConfigTest {

	@Autowired
	private BlankDisc blankDisc;
	
	@Test
	public void test() {
		blankDisc.play();
	}

}
