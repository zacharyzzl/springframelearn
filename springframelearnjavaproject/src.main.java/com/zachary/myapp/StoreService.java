/**   
* @version V1.0  
*/  
package com.zachary.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**  
* @author Zachary.Zheng 
* @Description: TODO(这里用一句话描述这个类的作用)   
* @date 2020年6月27日  
*/
@Component
public class StoreService {
	@Autowired
	private ShoppingCart shoppingCart;
	
	@Override
	public String toString() {
		return shoppingCart.toString();
	}
}
