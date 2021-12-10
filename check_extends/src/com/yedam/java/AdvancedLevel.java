package com.yedam.java;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("빨리 달립니다.");

	}

	@Override
	public void jump() {
		System.out.println("점프합니다.");
	}

	@Override
	public void turn() {
		System.out.println("Turn할 줄 모릅니다.");

	}

	@Override
	public void showPlayerinfo() {
		System.out.println("중급자 레벨입니다.");

	}

}