package com.yedam.java.test03;

public class MyAdder implements AdderInterface {

	@Override
	public int add(int x, int y) {
		return x + y;
	}

	@Override
	public int add(int n) {
		int result = 0;
		for (int i = 1; i <= n; i++) {
			result += i;
		}

		return result;
	}

}
