package com.yedam.java.review;

public class Anonymous {
	Worker field = new Worker() {
		@Override
		public void start() {
			System.out.println("디자인을 합니다.");
		}
	};

	void method1() {
		Worker localVar = null;
		localVar.start();
	}

	void method2(Worker worker) {
		worker.start();
	}
}
