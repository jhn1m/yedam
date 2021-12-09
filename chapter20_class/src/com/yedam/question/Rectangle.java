package com.yedam.question;

public class Rectangle {
	// 필드
	private double x;
	private double y;

	// 생성자
	public Rectangle(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// 메서드
	public double getArea(double x, double y) {
		return x * y;
	}

	public double getCircleCumference() {
		return x * y;
	}
}
