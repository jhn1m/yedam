package com.yedam.java.ch09.math;

public class MainExample {

	public static void main(String[] args) {
		// 부호상관없이 값 크기 구하기
		System.out.println("abs()");
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		System.out.println("v1 = " + v1);
		System.out.println("v2 = " + v2 + "\n");

		// 올림
		System.out.println("ceil()");
		double v3 = Math.ceil(5.3);
		double v4 = Math.ceil(-5.3);
		System.out.println("v3 = " + v3);
		System.out.println("v4 = " + v4 + "\n");

		// 버림
		System.out.println("floor()");
		double v5 = Math.floor(5.3);
		double v6 = Math.floor(-5.3);
		System.out.println("v5 = " + v5);
		System.out.println("v6 = " + v6 + "\n");

		// max 둘 중 큰값 반환
		System.out.println("max()");
		int v7 = Math.max(5, 9);
		double v8 = Math.max(5.3, 2.5);
		System.out.println("v7 = " + v7);
		System.out.println("v8 = " + v8 + "\n");

		// min 둘 중 작은값 반환
		System.out.println("min()");
		double v9 = Math.min(5, 9);
		double v10 = Math.min(5.3, 2.5);
		System.out.println("v9 = " + v9);
		System.out.println("v10 = " + v10 + "\n");

		// rint 가까운 정수의 실수값
		System.out.println("rint()");
		double v11 = Math.rint(5.3);
		double v12 = Math.rint(5.7);
		System.out.println("v11 = " + v11);
		System.out.println("v12 = " + v12 + "\n");

		// round 반올림
		System.out.println("round()");
		double v13 = Math.round(5.3);
		double v14 = Math.round(5.7);
		System.out.println("v13 = " + v13);
		System.out.println("v14 = " + v14 + "\n");

		// round는 소수점 1자리에서 반올림 하기 때문에 temp에 값을 저장 후 사용해야한다
		// temp는 3번째 자리에서 반올림 함
		double value = 12.3456;
		double temp1 = value * 100;
		long temp2 = Math.round(temp1);
		double v15 = temp2 / 100.0;
		System.out.println("v15 = " + v15);
		System.out.println("v16 = " + Math.round(value) + "\n");
	}
}