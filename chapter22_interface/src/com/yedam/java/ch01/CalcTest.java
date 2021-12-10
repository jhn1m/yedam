package com.yedam.java.ch01;

public class CalcTest {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		
//		Calculator calc = new Calculator();
		Calc calc = new Calculator();
		System.out.println(calc.add(x, y));
		System.out.println(calc.minus(x, y));
		System.out.println(calc.multi(x, y));
		System.out.println(calc.divide(x, y));
	}

}
