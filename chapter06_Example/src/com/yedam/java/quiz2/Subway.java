package com.yedam.java.quiz2;

public class Subway {
	// 필드
	String lineNumber;// 호선
	int money;// 수입
	int passengerCount;// 승객수

	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
		this.money = 0;
		this.passengerCount = 0;
	}
	// 메소드

	public void take(int money) {
		this.money += money;
		passengerCount++;
	}

	public void showInfo() {
		System.out.printf("지하철 %s의 승객은 %d이고 수입은 %d원입니다.\n", lineNumber, passengerCount, money);
	}
}
