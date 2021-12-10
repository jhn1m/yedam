package com.yedam.java.ch01;

public class Customer {
	// 필드
	// 고객아이디, 고객이름, 고객등급, 보너스포인트, 적립비율
	protected String customerId;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;

	// 기본생성자 > "SILVER", 0.01

	Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer() 생성자 호출");
	}
     
	Customer(String customerId, String customerName) {
		this();
		this.customerId = customerId;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer() 생성자 호출");
	}

	// 메서드 > 보너스 포인트 계산
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}

	// 메서드 > 고객 정보 출력
	public String showCustomerInfo() {
		return customerName + "님의 등급은" + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다.";
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

}
