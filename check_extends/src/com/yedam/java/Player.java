package com.yedam.java;

public class Player {
	private PlayerLevel level;

	public Player() {
		level = new BeginnerLevel();
		level.showPlayerinfo();
	}

	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showPlayerinfo();
	}

	public void play(int count) {
		level.go(count);
	}
}