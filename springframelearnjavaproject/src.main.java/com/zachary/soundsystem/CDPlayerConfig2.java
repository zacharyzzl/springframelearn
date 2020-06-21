/**
 * 
 */
package com.zachary.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.zachary.soundsystemtwo.Jay;

/**
 * @author Zachary.Zheng
 * @version 1.0
 * @date 2020年6月21日 下午3:03:00
 */
@Configuration
@ComponentScan(basePackageClasses = {SgtPeppers.class, Jay.class})
public class CDPlayerConfig2 {

}
