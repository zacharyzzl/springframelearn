/**   
* @version V1.0  
*/  
package com.zachary.aop;

import org.springframework.stereotype.Component;

/**  
* @author Zachary.Zheng 
* @version 1.0
* @date 2020年6月28日  下午11:53:29
*/
@Component
public class Concert implements Performance {

	@Override
	public void perform(String performContent) {
		System.out.println(performContent + "表演中。。。");
	}

}
