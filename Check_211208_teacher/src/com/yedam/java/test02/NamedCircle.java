package com.yedam.java.test02;

public class NamedCircle extends Circle {

	private String name;

	public NamedCircle(int radius, String name) {
		super(radius);
		this.name = name;
	}

	@Override
	public void show() {
		System.out.print(name + ", ");
		super.show();
	}

}
