package com.yedam.java.ch04.Class;

import com.yedam.java.ch01.object.Car;

public class MainExample {

	public static void main(String[] args) throws ClassNotFoundException {
//		Class clazz = Car.class;
//		Class clazz = Class.forName("com.yedam.java.ch01.object.Car");
		Car car = new Car();
		Class clazz = car.getClass();
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackageName());
		System.out.println(clazz.getConstructors());
	}

}
