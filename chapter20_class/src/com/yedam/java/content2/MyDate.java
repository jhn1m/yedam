package com.yedam.java.content2;

public class MyDate {
	private int day;

	public void setDay(int day) {
		if (day < 1 || day > 28) {
			System.out.println("오류입니다.");
		} else {
			this.day = day;
		}

	}

	public int getDay() {
		return day;
	}

}
