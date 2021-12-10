package com.yedam.java.ch03;

public class Player {
	private PlayerLevel level;

	public Player() {
		level = new BeginnerLevel();
		level.showLevelmessage();
	}

	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelmessage();
	}

	public void play(int count) {
		level.go(count);
	}

}
