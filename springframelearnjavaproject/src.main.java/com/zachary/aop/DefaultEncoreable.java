package com.zachary.aop;

import org.springframework.stereotype.Component;

@Component
public class DefaultEncoreable implements Encoreable {

	@Override
	public void performEncore() {
		System.out.println("Encoreable performEncore!!!");
	}

}
