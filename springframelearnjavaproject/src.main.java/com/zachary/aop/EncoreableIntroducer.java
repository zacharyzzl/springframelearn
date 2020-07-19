package com.zachary.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EncoreableIntroducer {
	//"+"表示Performance的所有子类；defaultImpl 表示默认需要添加的新的类
	@DeclareParents(value="com.zachary.aop.Performance+", defaultImpl=DefaultEncoreable.class)
	public static Encoreable encoreable;
}
