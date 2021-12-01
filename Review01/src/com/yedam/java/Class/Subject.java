package com.yedam.java.Class;

public class Subject {
	// 필드
	// 과목 이름
	private String math = "수학";
	private String korean = "국어";
	private String english = "영어";
	int score; // 과목 점수

	public String getMath() {
		return math;
	}

	public String getKorean() {
		return korean;
	}

	public String getEnglish() {
		return english;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	// 메소드

	// 각 필드의 getter, setter만 존재
}