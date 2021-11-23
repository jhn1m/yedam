package com.yedam.java.ch0605;

public class Singleton {

	// 필드
	private static Singleton singleton = new Singleton();

	private Singleton() {
	}

	// 메서드
	static Singleton getInstance() {
		return singleton;
	}
}