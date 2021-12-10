package com.yedam.java.ch03;

public abstract class PlayerLevel {
	// run
	public abstract void run();

	// jump
	public abstract void jump();

	// turn
	public abstract void turn();

	public abstract void showLevelmessage();

	// 필살기
	public void go(int count) {
		run();
		for (int i = 0; i < count; i++) {
			jump();
		}
		turn();
	};
}
