package com.yedam.java.content2;

public class MyDateTest {
	public static void main(String[] args) {
		MyDate date = new MyDate();
//		date.day = 30;
		date.setDay(30);
//		System.out.println(date.day);
		System.out.println(date.getDay());
	}
}
