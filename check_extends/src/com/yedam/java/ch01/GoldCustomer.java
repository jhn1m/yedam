package com.yedam.java.ch01;

public class GoldCustomer extends Customer {
	double saleRatio;

	GoldCustomer() {
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.05;
		System.out.println("GOLDCustomer() 생성자 호출");
	}

	GoldCustomer(String customerId, String customerName) {
		super(customerId, customerName); // 부모클래스 생성자 호출
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.05;
		System.out.println("GOLDCustomer() 생성자 호출");
	}

	@Override
	// 메서드 > 보너스 포인트 계산
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int) (price * saleRatio);
	}
}