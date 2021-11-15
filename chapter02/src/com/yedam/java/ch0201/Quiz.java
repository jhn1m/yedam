package com.yedam.java.ch0201;

public class Quiz {

	public static void main(String[] args) {

		// 문제 1) 정수형 변수 3개를 이용하여 정수값 54와 36을 아래와 같이
		// 출력하는 프로그램을 만들어라.
		// 54 + 36 = 90
		// 54 - 36 = 18
		// 54 * 36 = 1944
		// 54 / 36 = 1.5

		int a = 54, b = 36;
		int total = a + b;

		System.out.println(a + " + " + b + " = " + (total));
		total = a - b;
		System.out.println(a + " - " + b + " = " + (total));
		total = a * b;
		System.out.println(a + " * " + b + " = " + (total));
		total = a / b;
		System.out.println(a + " / " + b + " = " + (total));
		total = 0;

		// 문제 2) 다음과 같이 각 변수에 값이 지정되어 있을 때
		// 아래와 같이 출력하는 프로그램을 만들어라.

		int x = 10, y = 50, z = 90, temp;
		temp = x;
		x = y;
		y = z;
		z = temp;

		System.out.println("x:" + x + ", y:" + y + ", z:" + z);

		// 문제 3) 다음과 같이 오류가 날 경우 1라인만 수정하여 아래와
		// 같이 출력하는 프로그램을 만들어라.

		int m = 10;

		if (m == 10) {
			int n = 21;
			int sum = m + n;
			System.out.println("sum:" + sum);
		}
	}

}
