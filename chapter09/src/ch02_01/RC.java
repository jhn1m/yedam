package com.yedam.java.ch02_01;

public class RC {
	// 필드 초기값으로 대입
	RemoteControl field = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다");
		}

		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다");
		}
	};

	// 로컬 변수값으로 대입
	void method1() {
		RemoteControl localVar = new RemoteControl() {

			@Override
			public void turnOn() {
				// TODO Auto-generated method stub

			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub

			}
		};
		
		System.out.println();

		RC rc = new RC();
		// 익명객체 필드 사용
		rc.field.turnOn();
		// 익명객체 로컬변수 사용
		rc.method1();
		// 익명객체 매개변수 사용
		rc.method2(new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("SmartTV를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("SmartTV를 끕니다.");
			}
		});
	}
	// 매개변수값으로 대입
}
