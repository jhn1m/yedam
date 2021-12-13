package com.yedam.java.test01;

public class SalaryMan {
	// 필드
	private int salary;
	// 생성자

	public SalaryMan() {
		this.salary = 1000000;
	}

	public SalaryMan(int salary) {
		this.salary = salary;
	}

	// 메소드
	public int getAnnualGross() {
		int income = (this.salary * 12) + (this.salary * 5);
		return income;
	}

}
