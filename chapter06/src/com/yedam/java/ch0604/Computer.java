package com.yedam.java.ch0604;

public class Computer {
	int sum1(int[] values) {
		int sum1 = 0;
		for (int i = 0; i < values.length; i++) {
			sum1 += values[i];
		}
		return sum1;
	}

	int sum2(int... values) {
		int sum1 = 0;
		for (int i = 0; i < values.length; i++) {
			sum1 += values[i];
		}
		return sum1;
	}
}
