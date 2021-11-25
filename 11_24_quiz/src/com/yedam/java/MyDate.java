package com.yedam.java;

public class MyDate {
	// 클래스 완성하기
	// day(int), month(int), year(int) 필드는 private로 선언합니다.
	// 각 필드의 get, set 메서드를 public으로 만듭니다.
	// MyDate(int day, int month, int year)생성자를 만듭니다.
	// public boolean isValid()메서드를 만들어 날짜가 유효한지 확인합니다.

	// 필드
	private int day;
	private int month;
	private int year;

	// 생성자

	MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	// 메서드

	public boolean isValid() {
		if (month > 1 && month <= 12) {
			if ((month == 2)) {
				if (!(day >= 1 && day <= 28)) {
					System.out.println("유효하지 않은 날짜입니다.");
				} else {
					System.out.println("유효한 날짜입니다.");
				}
			} else if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10)
					|| (month == 12)) {
				if (!(day >= 1 && day <= 31)) {
					System.out.println("유효하지 않은 날짜입니다.");
					return false;
				} else {
					System.out.println("유효한 날짜입니다.");
					return true;
				}
			} else {
				if (!(day >= 1 && day <= 30)) {
					System.out.println("유효하지 않은 날짜입니다.");
					return false;
				} else {
					System.out.println("유효한 날짜입니다.");
					return true;
				}
			}
		} else {
			System.out.println("잘못 입력했습니다.");
			return false;
		}
		return false;
	}

	public boolean isValid_teacher() {
		int startOfMonth = 1;
		int endOfMonth = 0;
		switch (this.month) {
		case 2:
			endOfMonth = 28;
			break;

		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			endOfMonth = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			endOfMonth = 30;
			break;
		}
		if (this.day >= startOfMonth && this.day <= endOfMonth) {
			return true;
		} else {
			return false;
		}
	}

}
