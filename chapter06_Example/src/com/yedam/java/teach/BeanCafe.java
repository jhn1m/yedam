package com.yedam.java.teach;

public class BeanCafe {
	// 필드
	String cafeName;
	int money;
	int passengerCount;

	// 생성자
	public BeanCafe(String cafeName) {
		this.cafeName = cafeName;
		this.money = 0;
		this.passengerCount = 0;
	}

	// 메소드
	public void buyLatte(int money) {
		System.out.println("라떼를 " + money + "에 결제했습니다.");
		this.money += money;
		this.passengerCount++;
	}

	public void showInfo() {
		System.out.printf("%s의 손님은 %d이고 수입은 %d 입니다.\n", cafeName, passengerCount, money);
	}

}
