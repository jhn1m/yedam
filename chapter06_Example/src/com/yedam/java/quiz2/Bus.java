package com.yedam.java.quiz2;

public class Bus {
	// 필드

	int busNumber;// 노선
	int money;// 수입
	int passengerCount;// 승객수

	// 생성자
	public Bus(int busNumber) {
		this.busNumber = busNumber;
		this.money = 0;
		this.passengerCount = 0;
	}
	// 메소드

	public void take(int money) {
		this.money += money;
		passengerCount++;
	}

	public void showInfo() {
		System.out.printf("버스 %d번의 승객은 %d이고 수입은 %d원입니다.\n", busNumber, passengerCount, money);
	}

}
