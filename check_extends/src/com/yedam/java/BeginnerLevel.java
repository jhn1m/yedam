package com.yedam.java;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");

	}

	@Override
	public void jump() {
		System.out.println("Jump할 줄 모릅니다.");

	}

	@Override
	public void turn() {
		System.out.println("Turn할 줄 모릅니다.");

	}

	@Override
	public void showPlayerinfo() {
		System.out.println("초보자 레벨입니다.");

	}

}