package com.yedam.java.ch02_01;

public class MainExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		// 익명객체 필드사용
		anony.field.wake();
		// 익명객체 로컬변수사용
		anony.method1();
		// 익명객체 매개값 사용
		anony.method2(new Person() {
			@Override
			public void wake() {
				System.out.println("8시에 일어납니다.");
			}

			public void study() {
				System.out.println("공부합니다.");
			}

		});
		
		System.out.println();
		
		Window w = new Window();
		w.button1.touch();
		w.button2.touch();
	}

}
