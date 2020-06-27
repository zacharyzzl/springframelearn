/**   
* @version V1.0  
*/  
package com.zachary.myapp;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

/**  
* @author Zachary.Zheng 
* @Description: TODO(这里用一句话描述这个类的作用)   
* @date 2020年6月27日  
*/
@Component
@Scope(value=WebApplicationContext.SCOPE_SESSION, proxyMode=ScopedProxyMode.INTERFACES)
public interface ShoppingCart {
}
