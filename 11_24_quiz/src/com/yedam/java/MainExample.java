package com.yedam.java;

public class MainExample {
	public static void main(String[] args) {

		MyDate date1 = new MyDate(30, 2, 2000);
		System.out.println(date1.isValid_teacher() == true ? "유효한 날짜입니다." : "유효하지 않은 날짜입니다.");

		MyDate date2 = new MyDate(2, 10, 2006);
		System.out.println(date2.isValid_teacher() == true ? "유효한 날짜입니다." : "유효하지 않은 날짜입니다.");

	}

}
