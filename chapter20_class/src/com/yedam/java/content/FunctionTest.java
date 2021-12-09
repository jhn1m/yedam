package com.yedam.java.content;

public class FunctionTest {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 23;

		int sum1 = add(num1, num2);
		int sum2 = minus(num1, num2);
		int sum3 = multiply(num1, num2);
		int sum4 = division(num1, num2);

		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);
	}

	// 더하기
	static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}

	// 빼기
	static int minus(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}

	// 곱하기
	static int multiply(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}

	// 나누기
	static int division(int n1, int n2) {
//		if (n1 > n2) {
		int result = n1 / n2;
//		} else {
//			System.out.println("나누려는 수가 더 큽니다.");
//		}
		return result;
	}
}
