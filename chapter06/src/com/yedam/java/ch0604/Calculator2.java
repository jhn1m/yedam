package com.yedam.java.ch0604;

public class Calculator2 {
// 문제3) 간단히 사칙연산을 수행하는 계산기를 구현하고
// 외부에서 입력받은 두 가지 값에 대한 결과값을 모두 출력하세요.

	// 필드

	// 생성자

	// 메서드
	void calcAll(int x, int y) {
		plus(x, y);
		minus(x, y);
		multiply(x, y);
		division(x, y);
	}

	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	int minus(int x, int y) {
		int result = x - y;
		return result;
	}

	int multiply(int x, int y) {
		int result = x * y;
		return result;
	}

	int division(int x, int y) {
		int result = x / y;
		return result;
	}
}