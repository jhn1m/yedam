package com.yedam.java.ch02;

public abstract class Computer {
	public void turnOn() {
		System.out.println("전원을 켭니다");
	}

	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}

	// 디스플레이
	public abstract void display();

	// 타이핑
	public abstract void typing();
}
