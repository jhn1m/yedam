package com.yedam.java.ch03;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("엄청 빨리 달립니다.");

	}

	@Override
	public void jump() {
		System.out.println("점프 합니다.");

	}

	@Override
	public void turn() {
		System.out.println("턴 합니다.");

	}

	@Override
	public void showLevelmessage() {
		System.out.println("고급자 레벨입니다.");
	}

}