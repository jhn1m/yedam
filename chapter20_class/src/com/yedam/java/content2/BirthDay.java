package com.yedam.java.content2;

public class BirthDay {
	// 필드
	int day;
	int month;
	int year;

	BirthDay(int year, int month, int day) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	BirthDay() {
		this(2021, 12, 10);
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void printThis() {
		System.out.println(this);
	}

	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000);
		System.out.println(bDay);
		bDay.printThis();
	}

}
