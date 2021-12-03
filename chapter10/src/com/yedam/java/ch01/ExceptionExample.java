package com.yedam.java.ch01;

public class ExceptionExample {
	public static void main(String[] args) {
		// NullPointerException
		String data = null;
		System.out.println(data);
//		System.out.println(data.toString());

		// ArrayIndexOutOfBoundsException
		if (args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];

			System.out.println("args[0] : " + data1);
			System.out.println("args[1] : " + data2);
		}

		// NumberFormatException
		String data1 = "100";
		String data2 = "a100";

//		int value1 = Integer.parseInt(data1);
//		int value2 = Integer.parseInt(data2);
//
//		int result = value1 + value2;
//		System.out.printf("%d + %d = %d\n", value1, value2, result);

		// ClassCastException
		Dog dog = new Dog();
		Cat cat = new Cat();
		changeDog(dog);
		changeDog(cat);
	}

	public static void changeDog(Animal animal) {
		Dog dog = (Dog) animal;
	}

}

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}