package com.yedam.java.quiz2;

public class Taxi {
	// 필드
		String TaxiNumber;// 택시번호
		int money;// 수입
		int passengerCount;// 승객수

		public Taxi(String TaxiNumber) {
			this.TaxiNumber = TaxiNumber;
			this.money = 0;
			this.passengerCount = 0;
		}
		// 메소드

		public void take(int money) {
			this.money += money;
			passengerCount++;
		}

		public void showInfo() {
			System.out.printf("택시번호 %s의 승객은 %d이고 수입은 %d원입니다.\n", TaxiNumber, passengerCount, money);
		}
}
