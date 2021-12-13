package com.yedam.java.ch02_01;

public class Anonymous {
	// 필드 초기값으로 대입
	Person field = new Person() {

		public void work() {
			System.out.println("출근합니다.");
		}

		@Override
		public void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}

	};

	// 로컬 변수값으로 대입
	void method1() {
		Person localVar = new Person() {
			public void walk() {
				System.out.println("산책합니다.");
			}

			@Override
			public void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}

		};

		localVar.wake();
	}

	// 매개변수값으로 대입
	void method2(Person person) {
		person.wake();
	}
}