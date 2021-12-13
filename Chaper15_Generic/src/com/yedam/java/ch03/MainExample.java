package com.yedam.java.ch03;

import com.yedam.java.ch02.Box;

public class MainExample {

	public static void main(String[] args) {
		Product<TV, String> product1 = new Product<TV, String>();
		product1.setKind(new TV());
		product1.setModel("스마트 TV");
		TV tv = product1.getKind();
		String tvModel = product1.getModel();

		Product<Car, String> product2 = new Product<Car, String>();
		product2.setKind(new Car());
		product2.setModel("디젤");
		Car car = product2.getKind();
		String carModel = product2.getModel();

		Box<Integer> box1 = UtilBox.<Integer>boxing(100);
		int intValue = box1.get();

		Box<String> box2 = UtilBox.boxing("홍길동");
		String name = box2.get();

		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "사과");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "사과");
		boolean result1 = UtilPair.<Integer, String>compare(p1, p2);
		if (result1) {
			System.out.println("논리적으로 동등");
		} else {
			System.out.println("동등하지 않음");
		}

		Point<Integer, Double> p3 = new Point<Integer, Double>(10, 10.0);
		Point<Integer, Double> p4 = new Point<Integer, Double>(0, 0.0);
		double rect = GenericMethod.makeRectangle(p3, p4);
		System.out.println("두 점으로 만들어진 사각형의 넓이는 " + rect + "입니다.");
		
		
	}
}
