package com.yedam.java.quiz4;

public class MainExample {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance(); // 자동차 공장 완성!
		Car firstCar = factory.createCar();
		Car secondCar = factory.createCar();
		System.out.println(firstCar.getCarNumber());
		System.out.println(secondCar.getCarNumber());
	}

}
