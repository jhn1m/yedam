package com.yedam.java.ch01;

public class MyClass {
	// 필드
	RemoteControl rc = new Television();

	// 생성자
	MyClass() {

	}

	MyClass(RemoteControl rc) {
		this.rc = rc;
		this.rc.turnOn();
		this.rc.setVolume(5);
	}

	// 메소드
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(3);
	}

	void methodB() {
		rc.turnOn();
		rc.setVolume(8);
	}
}
