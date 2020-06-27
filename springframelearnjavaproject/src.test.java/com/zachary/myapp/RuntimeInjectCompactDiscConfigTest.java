/**   
* @version V1.0  
*/  
package com.zachary.myapp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zachary.soundsystem.impl.BlankDisc;

/**  
* @author Zachary.Zheng 
* @version 1.0
* @date 2020年6月27日  下午4:27:40
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=RuntimeInjectCompactDiscConfig.class)
public class RuntimeInjectCompactDiscConfigTest {

	@Autowired
	BlankDisc blankDisc;
	
//	@Autowired
//	@Qualifier("setBlankDisc2")
//	BlankDisc blankDisc2;
	
	@Test
	public void setBlankDiscTest() {
		blankDisc.play();
	}
	
//	@Test
//	public void setBlankDiscTest2() {
//		blankDisc2.play();
//	}
	
	
}
