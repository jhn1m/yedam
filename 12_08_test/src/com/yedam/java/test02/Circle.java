package com.yedam.java.test02;

//문제2) 원을 표현하는 다음 Circle 클래스가 있습니다. 
// Circle 클래스를 상속받은 NamedCircle 클래스를 선언하여, 다음 main()을 실행할 때 다음 실행 결과와 같이 출력되도록 하세요.
// - class Circle {
//		private int radius;
//		public Circle(int radius) {
//			this.radius = radius;
//		}
//		public void show() {
//			System.out.println("반지름 = " + this.radius);
//		}
//	}
//	
//	- 실행코드
//	public static void main(String[] args) {
//		Circle w = new NamedCircle(5, "Waffle");
//		w.show();
//	}
//	
//	- 실행결과
//	Waffle, 반지름 = 5

public class Circle {
	private int radius;
	private String name;

	public Circle() {
	}

	public Circle(int radius) {
		this.setRadius(radius);
	}

	public void show() {
		System.out.println(getName() + ", 반지름 = " + this.getRadius());
	}

	public static void main(String[] args) {
		Circle w = new NamedCircle(5, "Waffle");
		w.show();
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
