package com.yedam.java.test03;

public class MainExample {
	public static void main(String[] args) {
		AdderInterface adder = new MyAdder();
		System.out.println(adder.add(5,10));
		System.out.println(adder.add(10));
	}
}
