package com.yedam.java.ch0604;

public class Calculator3 {
	// 교수님 풀이

	// 필드

	// 생성자

	// 메서드
	int plus(int x, int y) {
		return x + y;
	}

	int minus(int x, int y) {
		return x - y;
	}

	int multi(int x, int y) {
		return x * y;
	}

	int divide(int x, int y) {
		return x / y;
	}

	void excute(int x, int y) {
		System.out.println("+ : " + plus(x, y));
		System.out.println("- : " + minus(x, y));
		System.out.println("* : " + multi(x, y));
		System.out.println("/ : " + divide(x, y));
	}
}
