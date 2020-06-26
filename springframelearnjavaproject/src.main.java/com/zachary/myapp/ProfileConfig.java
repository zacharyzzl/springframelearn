/**   
* @version V1.0  
*/  
package com.zachary.myapp;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**  
* @author Zachary.Zheng 
* @Description: TODO(这里用一句话描述这个类的作用)   
* @date 2020年6月26日  
*/
@Configuration
@Import({DevelopmentProfileConfig.class, ProductionProfileConfig.class})
public class ProfileConfig {

}
