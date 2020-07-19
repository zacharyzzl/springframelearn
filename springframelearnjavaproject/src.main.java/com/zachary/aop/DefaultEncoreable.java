package com.zachary.aop;

public class DefaultEncoreable implements Encoreable {

	@Override
	public void performEncore() {
		System.out.println("Encoreable performEncore!!!");
	}

}
