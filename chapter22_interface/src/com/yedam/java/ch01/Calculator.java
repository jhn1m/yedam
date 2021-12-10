package com.yedam.java.ch01;

public class Calculator implements Calc {

	@Override
	public int add(int x, int y) {
		return x + y;
	}

	@Override
	public int minus(int x, int y) {
		if (x > y) {
			return x - y;
		} else {
			return y - x;
		}
	}

	@Override
	public int multi(int x, int y) {
		return x * y;
	}

	@Override
	public int divide(int x, int y) {
		if (y != 0) {
			return x / y;
		} else {
			return ERROR;
		}
	}

	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}

}
