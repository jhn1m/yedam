package com.yedam.java.test01;

//문제1) 다음을 만족하는 클래스 SalaryMan을 선언하세요.
//· 필드 salary는 월 급여액를 저장하며, int형으로 초기 값으로 1000,000 저장
//· 메소드 getAnnualGross()는 연봉을 반환하는 메소드로 12개월치 월급에 한달치 급여액 * 보너스 500%을 더함
//· 기본 생성자에서 필드 salary의 초기 값을 사용하며, 정수형 인자인 생성자에서 인자가 월 급여액으로 지정
//· 다음과 같이 객체를 생성하여 메소드 getAnnualGrass()를 호출하여 출력
//public static void main(String[] args){
//	System.out.println(new SalaryMan().getAnnualGross());
//	System.out.println(new SalaryMan(2000000).getAnnualGross());
//}

public class SalaryMan {
	// 필드
	public int salary = 1000000;
	public int yearSalary;

	// 생성자
	public SalaryMan() {

	}

	public SalaryMan(int salary) {
		this.salary = salary;
	}

	// 메소드
	public int getAnnualGross() {
		yearSalary = ((salary * 12) + (salary * 5));
		return yearSalary;
	}

	public static void main(String[] args) {
		System.out.println(new SalaryMan().getAnnualGross());
		System.out.println(new SalaryMan(2000000).getAnnualGross());
	}
}
