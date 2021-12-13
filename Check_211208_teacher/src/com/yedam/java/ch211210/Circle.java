package com.yedam.java.ch211210;

public class Circle {
	private double x, y;
	private int radius;

	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public void show() {
		System.out.printf("( %.1f X %.1f ) %d\n", x, y, radius);
	}

}
