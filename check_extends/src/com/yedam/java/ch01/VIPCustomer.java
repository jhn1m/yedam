package com.yedam.java.ch01;

public class VIPCustomer extends Customer {
	int agentId;
	double saleRatio;

	VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer() 생성자 호출");
	}

	VIPCustomer(String customerId, String customerName) {
		super(customerId, customerName); // 부모클래스 생성자 호출
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer() 생성자 호출");
	}

	public int getAgendId() {
		return agentId;
	}

	@Override
	// 메서드 > 보너스 포인트 계산
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int) (price * saleRatio);
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "\n 담당 상담원 번호는 " + agentId + "입니다.";
	}

}