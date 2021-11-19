package com.yedam.java.ch0603;

public class MainExample {

	public static void main(String[] args) {
		// 생성자를 호출해서 객체 생성
		Car car = new Car("검정", 3000);

		// 생성자에서 필드 초기화
		Korean k1 = new Korean("홍길동", "123456-1234567");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		System.out.println("k1.nation : " + k1.nation + "\n");

		Korean k2 = new Korean("동길홍", "654321-7654321");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
		System.out.println("k2.nation : " + k2.nation);

		// 인스턴스 생성 시 생성자를 선택
		
	}
}