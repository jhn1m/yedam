package com.yedam.java.ch03_01;

public class MainExample {

	public static void main(String[] args) {
//		Phone phone = new Phone("홍길동");
		SmartPhone smartphone = new SmartPhone("홍길동");

		smartphone.turnOn();
		smartphone.internetSearch();
		smartphone.turnOff();

		System.out.println();

		Dog dog = new Dog();
		Cat cat = new Cat();

		dog.sound();
		cat.sound();
		System.out.println();

		Animal animal = null;
		animal = new Dog();
		animal.sound();

		animal = new Cat();
		animal.sound();

		System.out.println();

		animalSound(new Dog());
		animalSound(new Cat());
	}

	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
